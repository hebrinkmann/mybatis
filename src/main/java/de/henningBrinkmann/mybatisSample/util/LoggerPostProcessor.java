package de.henningBrinkmann.mybatisSample.util;

import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LoggerPostProcessor implements BeanPostProcessor {
	private static Logger logger = LoggerFactory.getLogger(LoggerPostProcessor.class);

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		Arrays.stream(bean.getClass().getDeclaredFields()).forEach(field -> {
			if (Logger.class.isAssignableFrom(field.getType()) && field.getAnnotation(InjectLogger.class) != null) {
				logger.debug("Injecting logger to {}.", bean.getClass());
				
				if ((field.getModifiers() & Modifier.STATIC) == 0) {
					field.setAccessible(true);
					try {
						field.set(bean, LoggerFactory.getLogger(bean.getClass()));
					} catch (Exception e) {
						logger.error("Failed to inject logger to {}.", bean.getClass().getName());
					}
				}
			}
		});
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
