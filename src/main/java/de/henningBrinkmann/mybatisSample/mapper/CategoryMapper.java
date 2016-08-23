package de.henningBrinkmann.mybatisSample.mapper;

import org.apache.ibatis.annotations.Select;

import de.henningBrinkmann.mybatisSample.xmltv.Category;

public interface CategoryMapper {
	void insertCategory(Category category);
	
	@Select("SELECT * FROM `mybatissample`.`category` WHERE `value` = #{value}")
	Category findCategoryByValue(String value);
}
