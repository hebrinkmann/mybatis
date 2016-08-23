package de.henningBrinkmann.mybatisSample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.henningBrinkmann.mybatisSample.mapper.CategoryMapper;
import de.henningBrinkmann.mybatisSample.xmltv.Category;

@Component
public class CategoryService {
	@Autowired
	private CategoryMapper categoryMapper;
	
	public void persist(Category category) {
		categoryMapper.insertCategory(category);
	}
	
	public Category findCategoryByValue(String value) {
		return categoryMapper.findCategoryByValue(value);
	}
}
