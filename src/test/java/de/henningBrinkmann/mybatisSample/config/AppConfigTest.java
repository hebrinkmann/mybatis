package de.henningBrinkmann.mybatisSample.config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;

public class AppConfigTest extends WebIntegrationTest {

	@Autowired
	private ApplicationContext context;
	
	@Test
	public void test() {
		Assert.assertNotNull(context);
	}

}
