package de.henningBrinkmann.mybatisSample.config;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import de.henningBrinkmann.mybatisSample.util.SurroundingClassnameLogger;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "de.henningBrinkmann.mybatisSample")
@MapperScan("de.henningBrinkmann.mybatisSample.mapper")
public class AppConfig extends WebMvcConfigurerAdapter {
	private static Logger logger = LoggerFactory.getLogger(AppConfig.class);
	private final DataSource dataSource = new PooledDataSource("org.mariadb.jdbc.Driver", "jdbc:mariadb://172.17.42.1/mybatissample", "mybatissample", "59oZ2tPUku2ucLfub7aNu6lqE9bzMbHly2gJI9qar48");
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	public Properties gitProperties() {
		try {
			return PropertiesLoaderUtils.loadProperties(new ClassPathResource("/git.properties"));
		} catch (IOException e) {
			logger.error("Failed to load git.properties: {}", e);
		}
		
		return new Properties();
	}
	
	@Bean
	public DataSource dataSource() {
		return dataSource;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager result = new DataSourceTransactionManager(dataSource);
				
		return result;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean result = new SqlSessionFactoryBean();
		Properties configProperties = new Properties();
		configProperties.setProperty("transactionFactory", ManagedTransactionFactory.class.getName());
		result.setConfigurationProperties(configProperties);
		result.setDataSource(dataSource);
		
		return result;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Logger logger() {
		Logger result = new SurroundingClassnameLogger();
		
		return result;
	}
}
