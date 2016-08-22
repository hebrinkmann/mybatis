package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Category {
	@XmlValue
	private String value;
	
	@XmlAttribute
	private String lang;

	public String getValue() {
		return value;
	}

	public String getLang() {
		return lang;
	}
}
