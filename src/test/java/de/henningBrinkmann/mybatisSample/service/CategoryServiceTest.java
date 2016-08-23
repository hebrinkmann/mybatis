package de.henningBrinkmann.mybatisSample.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;
import de.henningBrinkmann.mybatisSample.xmltv.Category;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CategoryServiceTest extends WebIntegrationTest{

	@Autowired
	private CategoryService testee;
	
	@Test
	public void testPersist() {
		Category category = new CategoryBuilder().build();
		
		testee.persist(category);
		
		Category loadedCategory = testee.findCategoryByValue(category.getValue());
		
		assertThat(loadedCategory, notNullValue());
	}

}
