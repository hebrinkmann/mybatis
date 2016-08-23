package de.henningBrinkmann.mybatisSample.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;
import de.henningBrinkmann.mybatisSample.xmltv.Description;

public class DescriptionServiceTest extends WebIntegrationTest {

	@Autowired
	private DescriptionService testee;
	
	@Test
	public void testPersistDescription() {
		Description description = new DescriptionBuilder().build();
		
		testee.persistDescription(description);
		
		Description loadedDescription = testee.findDescriptionByValue(description.getValue());
		
		assertThat(loadedDescription, notNullValue());
	}

}
