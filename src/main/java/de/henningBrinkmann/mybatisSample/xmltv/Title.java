package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Title {
	@XmlValue
	private String value;

	@XmlAttribute
	private String lang;

	public String getLang() {
		return lang;
	}

	public String getValue() {
		return value;
	}	
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
