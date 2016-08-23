package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Description {
	@XmlValue
	private String value;
	
	@XmlAttribute
	private String lang;
	
	private Integer iddescription;

	public Integer getIddescription() {
		return iddescription;
	}

	public String getLang() {
		return lang;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setIddescription(Integer iddescription) {
		this.iddescription = iddescription;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
