package de.henningBrinkmann.mybatisSample.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.henningBrinkmann.mybatisSample.config.AppConfig;
import de.henningBrinkmann.mybatisSample.util.InjectLogger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@ComponentScan(basePackages = "de.henningBrinkmann.mybatisSample")
public abstract class IntegrationTest {
	public IntegrationTest() {
		super();
	}

}