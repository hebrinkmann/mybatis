package de.henningBrinkmann.mybatisSample.xmltv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Channel {
	private Integer idchannel;

	@XmlAttribute(name = "id")
	private String channelId;

	@XmlElement(name = "display-name")
	private String displayName;

	@XmlElement
	private String url;

	@XmlElement
	private Icon icon;

	public String getChannelId() {
		return channelId;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public Icon getIcon() {
		return icon;
	}
	
	public Integer getIdchannel() {
		return idchannel;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	public void setId(String id) {
		this.channelId = id;
	}
	
	public void setIdchannel(Integer idchannel) {
		this.idchannel = idchannel;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getIconUrl() {
		if (icon != null) {
			return icon.getSrc();
		}
		return null;
	}
	
	public void setIconUrl(String iconUrl) {
		if (icon == null) {
			icon = new Icon();
		}
		
		icon.setSrc(iconUrl);
	}
}
