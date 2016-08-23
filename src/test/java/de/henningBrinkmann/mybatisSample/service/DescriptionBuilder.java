package de.henningBrinkmann.mybatisSample.service;

import java.util.UUID;

import de.henningBrinkmann.mybatisSample.xmltv.Description;

public class DescriptionBuilder {
	private String lang;
	private String value = "description-" + UUID.randomUUID();

	public Description build() {
		Description result = new Description();
		result.setLang(lang);
		result.setValue(value);

		return result;
	}
}
