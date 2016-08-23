package de.henningBrinkmann.mybatisSample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.henningBrinkmann.mybatisSample.mapper.ProgrammeMapper;
import de.henningBrinkmann.mybatisSample.xmltv.Programme;

@Component
public class ProgrammeService {
	@Autowired
	private ProgrammeMapper programmeMapper;
	
	public void persistProgramme(Programme programme) {
		programmeMapper.insertProgramme(programme);
	}
	
	public List<Programme> getProgrammes() {
		return programmeMapper.getProgrammes();
	}
}
