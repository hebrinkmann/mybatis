package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Description {
	@XmlValue
	private String value;
	
	public String getValue() {
		return value;
	}

	public String getLang() {
		return lang;
	}

	@XmlAttribute
	private String lang;
}
