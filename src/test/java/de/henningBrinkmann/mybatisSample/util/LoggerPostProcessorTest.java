package de.henningBrinkmann.mybatisSample.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;

public class LoggerPostProcessorTest extends WebIntegrationTest {
	@Autowired
	private ClassWithLogger testee;
	
	@Test
	public void loggerSouldBeInjected() {
		Assert.notNull(testee.getLogger(), "Logger should not be null.");
	}

}
