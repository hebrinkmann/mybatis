package de.henningBrinkmann.mybatisSample.service;

import java.util.UUID;

import de.henningBrinkmann.mybatisSample.xmltv.Channel;
import de.henningBrinkmann.mybatisSample.xmltv.Icon;

public class ChannelBuilder {
	private String id = "channel-" + UUID.randomUUID();
	private String displayName = id;
	private String url = "https://henning-brinkmann.de/" + displayName;
	private Icon icon = new Icon();
	
	{
		icon.setSrc("https://henning-brinkmann.de/icon/" + displayName);
	}

	public Channel build() {
		Channel result = new Channel();
		result.setId(id);
		result.setDisplayName(displayName);
		result.setUrl(url);
		result.setIcon(icon);
		
		return result;
	}
}
