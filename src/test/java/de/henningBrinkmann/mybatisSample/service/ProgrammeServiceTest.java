package de.henningBrinkmann.mybatisSample.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.henningBrinkmann.mybatisSample.test.WebIntegrationTest;

public class ProgrammeServiceTest extends WebIntegrationTest {
	
	@Autowired
	private ProgrammeService testee;		
	
	@Test
	public void testPersistProgramme() {
	}

}
