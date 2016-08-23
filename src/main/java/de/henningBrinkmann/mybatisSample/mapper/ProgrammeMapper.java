package de.henningBrinkmann.mybatisSample.mapper;

import java.util.List;

import de.henningBrinkmann.mybatisSample.xmltv.Programme;

public interface ProgrammeMapper {
	void insertProgramme(Programme programme);
	
	List<Programme> getProgrammes();
}
