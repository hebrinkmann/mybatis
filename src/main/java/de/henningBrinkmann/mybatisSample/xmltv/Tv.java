package de.henningBrinkmann.mybatisSample.xmltv;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tv {
	@XmlAttribute(name = "source-data-url")
	private String sourceDataUrl;
	
	@XmlAttribute(name = "source-info-name")
	private String sourceInfoName;
	
	@XmlAttribute(name = "source-info-url")
	private String sourceInfoUrl;
	
	@XmlElement(name="channel")
	private Channel channel;
	
	@XmlElement(name = "programme")
	private Programme[] programmes;
	
	@Override
	public String toString() {
		return String.format("Tv [sourceDataUrl=%s, sourceInfoName=%s, sourceInfoUrl=%s]", sourceDataUrl,
				sourceInfoName, sourceInfoUrl);
	}
	
	
}
