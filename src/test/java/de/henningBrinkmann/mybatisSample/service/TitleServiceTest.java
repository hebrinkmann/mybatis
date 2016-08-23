package de.henningBrinkmann.mybatisSample.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;
import de.henningBrinkmann.mybatisSample.xmltv.Title;

public class TitleServiceTest extends WebIntegrationTest {
	@Autowired
	private TitleService testee;
	
	@Test
	public void testPersistTitle() {
		Title title = new TitleBuilder().build();
		
		testee.persistTitle(title);
		
		Title loadedTitle = testee.findTitleByValue(title.getValue());
		
		assertThat(loadedTitle, notNullValue());
	}

}
