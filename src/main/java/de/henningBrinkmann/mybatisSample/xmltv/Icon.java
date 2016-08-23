package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;

public class Icon {
	@XmlAttribute
	private String src;

	public String getSrc() {
		return src;
	}
	
	public void setSrc(String src) {
		this.src = src;
	}
}
