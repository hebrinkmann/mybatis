package de.henningBrinkmann.mybatisSample.rest;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/version")
public class VersionRestController {
	@Autowired
	Properties gitProperties;
	
	@RequestMapping(method = RequestMethod.GET)
	String getVersion() {
		return gitProperties.toString();
	}
}
