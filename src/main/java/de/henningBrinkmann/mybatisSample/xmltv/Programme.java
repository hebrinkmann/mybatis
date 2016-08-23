package de.henningBrinkmann.mybatisSample.xmltv;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Programme {
	@XmlAttribute
	private String channel;
	
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

	public Category getCategory() {
		return category;
	}
	
	public String getChannel() {
		return channel;
	}
	
	public Description getDescription() {
		return description;
	}
	
	Integer getIdcategory() {
		if (category != null) {
			return category.getIdcategory();
		}
		
		return null;
	}
	
	Integer getIddescription() {
		if (description != null) {
			return description.getIddescription();
		}
		
		return null;
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
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public void setDescription(Description description) {
		this.description = description;
	}
	
	public void setStart(Date start) {
		this.start = start;
	}
	
	public void setStop(Date stop) {
		this.stop = stop;
	}
	
	public void setTitle(Title title) {
		this.title = title;
	}
}
