package de.henningBrinkmann.mybatisSample.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.henningBrinkmann.mybatisSample.entity.Source;
import de.henningBrinkmann.mybatisSample.mapper.SourceMapper;
import de.henningBrinkmann.mybatisSample.util.InjectLogger;

@Component
public class SourceService {
	@InjectLogger
	private Logger logger;
	
	@Autowired
	private SourceMapper sourceMapper;
	
	public Source getSource(int id) {
		Source source = sourceMapper.getSource(id);
		
		logger.debug("Loaded source with id {}: {}", id, source);
		
		return source;
	}
}
