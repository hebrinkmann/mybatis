package de.henningBrinkmann.mybatisSample.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import de.henningBrinkmann.mybatisSample.entity.Source;
import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;

public class SourceServiceTest extends WebIntegrationTest {

	@Autowired
	private SourceService testee;
	
	@Test
	public void getSource() {
		Source source = testee.getSource(0);
		
		Assert.notNull(source);
	}

}
