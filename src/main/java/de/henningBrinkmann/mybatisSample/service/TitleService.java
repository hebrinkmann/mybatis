package de.henningBrinkmann.mybatisSample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.henningBrinkmann.mybatisSample.mapper.TitleMapper;
import de.henningBrinkmann.mybatisSample.xmltv.Title;

@Component
public class TitleService {
	@Autowired
	private TitleMapper titleMapper;
	
	public void persistTitle(Title title) {
		titleMapper.insertTitle(title);
	}
	
	public Title findTitleByValue(String value) {
		return titleMapper.getTitleByValue(value);
	}
	
}
