package de.henningBrinkmann.mybatisSample.util;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassWithLogger {
	@InjectLogger
	private Logger logger;
	
	@Autowired
	private Logger appLogger1;
	
	@Autowired
	private Logger appLogger2;
	
	public Logger getLogger() {
		return logger;
	}
	
	public Logger getAppLogger1() {
		return appLogger1;
	}
	
	public Logger getAppLogger2() {
		return appLogger2;
	}
}
