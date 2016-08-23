package de.henningBrinkmann.mybatisSample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.henningBrinkmann.mybatisSample.mapper.DescriptionMapper;
import de.henningBrinkmann.mybatisSample.xmltv.Description;

@Component
public class DescriptionService {
	@Autowired
	private DescriptionMapper descriptionMapper;
	
	public void persistDescription(Description description) {
		descriptionMapper.insertDescription(description);
	}
	
	public Description findDescriptionByValue(String value) {
		return descriptionMapper.findDescriptionByValue(value);
	}
}
