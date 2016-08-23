package de.henningBrinkmann.mybatisSample.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;

public class LoggerTest extends WebIntegrationTest{
	@Autowired
	private ClassWithLogger testee;

	@Test
	public void testAppLoggers() {
		Logger appLogger1 = testee.getAppLogger1();
		assertThat(appLogger1, notNullValue());
		Logger appLogger2 = testee.getAppLogger2();
		
		appLogger1.info("Using applogger 1.");
		appLogger2.info("Using applogger 2.");
		
		assertThat(appLogger2, notNullValue());
		assertThat(appLogger1, not(equalTo(appLogger2)));
	}

}
