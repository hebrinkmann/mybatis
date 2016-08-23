package de.henningBrinkmann.mybatisSample.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.UUID;

import de.henningBrinkmann.mybatisSample.xmltv.Description;
import de.henningBrinkmann.mybatisSample.xmltv.Programme;
import de.henningBrinkmann.mybatisSample.xmltv.Title;

public class ProgrammeBuilder {
	private String channel = "channel-" + UUID.randomUUID();
	private Title title = new TitleBuilder().build();
	private Date start = new Date();
	private Date stop = Date.from(start.toInstant().plus(2, ChronoUnit.HOURS));
	private Description description = new DescriptionBuilder().build();
	
	public Programme build() {
		Programme programme = new Programme();
		programme.setChannel(channel);
		programme.setTitle(title);
		programme.setStart(start);
		programme.setStop(stop);
		programme.setDescription(description);
		
		return programme;
	}
}
