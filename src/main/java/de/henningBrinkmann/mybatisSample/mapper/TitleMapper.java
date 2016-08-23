package de.henningBrinkmann.mybatisSample.mapper;

import org.apache.ibatis.annotations.Select;

import de.henningBrinkmann.mybatisSample.xmltv.Title;

public interface TitleMapper {
	void insertTitle(Title title);
	
	@Select("SELECT * FROM `mybatissample`.`title` WHERE `value` = #{value}")
	Title getTitleByValue(String value);
}
