package de.henningBrinkmann.mybatisSample.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.util.Assert;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;

public class LoggerPostProcessorTest extends WebIntegrationTest {
	@InjectLogger
	protected Logger logger;

	@Test
	public void loggerSouldBeInjected() {
		Assert.notNull(logger, "Logger should not be null.");
	}

}
