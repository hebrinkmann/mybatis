package de.henningBrinkmann.mybatisSample.service;

import java.util.UUID;

import de.henningBrinkmann.mybatisSample.xmltv.Category;

public class CategoryBuilder {
	private String lang;
	private String value = "category-" + UUID.randomUUID();

	public Category build() {
		Category result = new Category();
		result.setLang(lang);
		result.setValue(value);
		
		return result;
	}
}
