package de.henningBrinkmann.mybatisSample.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;
import de.henningBrinkmann.mybatisSample.xmltv.Channel;

public class ChannelServiceTest extends WebIntegrationTest {
	@Autowired
	private Logger logger;
	
	@Autowired
	private ChannelService testee;
	
	@Test
	public void testPersistChannel() {
		Channel channel = new ChannelBuilder().build();
		
		testee.persistChannel(channel);
		
		Channel channel2 = testee.findChannelByDisplayname(channel.getDisplayName());
		
		Assert.notNull(channel2, "Persisted channel should be found.");
		
		logger.info("Inserted channel: {}", channel);
	}

}
