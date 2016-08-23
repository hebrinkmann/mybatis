package de.henningBrinkmann.mybatisSample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.henningBrinkmann.mybatisSample.mapper.ChannelMapper;
import de.henningBrinkmann.mybatisSample.xmltv.Channel;

@Component
@Transactional
public class ChannelService {
	@Autowired ChannelMapper channelMapper;
	
 	public void persistChannel(Channel channel) {
 		channelMapper.insertChannel(channel);
 	}
 	
 	public Channel findChannel(int id) {
 		return channelMapper.getChannel(id);
 	}
 	
 	public Channel findChannelByDisplayname(String displayName) {
 		return channelMapper.getChannelByDisplayName(displayName);
 	}
}
