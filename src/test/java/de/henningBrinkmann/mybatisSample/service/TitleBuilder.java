package de.henningBrinkmann.mybatisSample.service;

import java.util.UUID;

import de.henningBrinkmann.mybatisSample.xmltv.Title;

public class TitleBuilder {
	private String lang = null;
	private String value = "title-" + UUID.randomUUID();

	public Title build() {
		Title result = new Title();
		result.setLang(lang);
		result.setValue(value);
		
		return result;
	}
}
