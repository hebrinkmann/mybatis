package de.henningBrinkmann.mybatisSample.mapper;

import org.apache.ibatis.annotations.Select;

import de.henningBrinkmann.mybatisSample.xmltv.Description;

public interface DescriptionMapper {
	void insertDescription(Description description);
	
	@Select("SELECT * FROM mybatissample.description WHERE `value` = #{value};")
	Description findDescriptionByValue(String value);
}
