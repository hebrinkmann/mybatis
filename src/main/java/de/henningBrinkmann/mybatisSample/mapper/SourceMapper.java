package de.henningBrinkmann.mybatisSample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import de.henningBrinkmann.mybatisSample.entity.Source;

public interface SourceMapper {
	Source getSource(int sourceId);
	
	@Select("select * from source")
	List<Source> getSources();
}
