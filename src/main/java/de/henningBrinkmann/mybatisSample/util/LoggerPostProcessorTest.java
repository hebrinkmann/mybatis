package de.henningBrinkmann.mybatisSample.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import de.henningBrinkmann.mybatisSample.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class LoggerPostProcessorTest {
	@InjectLogger
	private Logger logger;
	
	@Test
	public void loggerSouldBeInjected() {
		Assert.notNull(logger, "Logger should not be null.");
	}

}
