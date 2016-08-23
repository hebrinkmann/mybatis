package de.henningBrinkmann.mybatisSample.test;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import de.henningBrinkmann.mybatisSample.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@ComponentScan(basePackages = "de.henningBrinkmann.mybatisSample")
@Transactional
public abstract class IntegrationTest {
	public IntegrationTest() {
		super();
	}

}