package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Channel {
	public String getId() {
		return id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getUrl() {
		return url;
	}

	public Icon getIcon() {
		return icon;
	}

	@XmlAttribute
	private String id;
	
	@XmlElement(name = "display-name")
	private String displayName;
	
	@XmlElement
	private String url;
	
	@XmlElement
	private Icon icon;
}
