package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Title {
	@XmlValue
	private String value;

	@XmlAttribute
	private String lang;
	
	private Integer idtitle;

	public Integer getIdtitle() {
		return idtitle;
	}

	public String getLang() {
		return lang;
	}	
	
	public String getValue() {
		return value;
	}
	
	public void setIdtitle(Integer idtitle) {
		this.idtitle = idtitle;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
