package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Category {
	@XmlValue
	private String value;
	
	@XmlAttribute
	private String lang;
	
	private Integer idcategory;

	public Integer getIdcategory() {
		return idcategory;
	}

	public String getLang() {
		return lang;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setIdcategory(Integer idcategory) {
		this.idcategory = idcategory;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
