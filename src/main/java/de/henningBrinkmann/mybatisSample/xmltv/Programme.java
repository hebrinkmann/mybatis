package de.henningBrinkmann.mybatisSample.xmltv;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Programme {
	@XmlAttribute
	private String channel;
	
	public String getChannel() {
		return channel;
	}

	public Date getStart() {
		return start;
	}

	public Date getStop() {
		return stop;
	}

	public Title getTitle() {
		return title;
	}

	public Category getCategory() {
		return category;
	}

	public Description getDescription() {
		return description;
	}

	@XmlAttribute
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date start;
	
	@XmlAttribute
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date stop;
	
	@XmlElement
	private Title title;
	
	@XmlElement
	private Category category;
	
	@XmlElement(name="desc")
	private Description description;
}
