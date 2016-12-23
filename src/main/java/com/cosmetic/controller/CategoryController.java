package com.cosmetic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cosmetic.domain.Category;
import com.cosmetic.repository.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/category", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping(value = "/all")
	public @ResponseBody List<Category> getCategoryList() {
		return categoryRepository.findAll();
	}

	@RequestMapping(value = "{categoryId}")
	public Category getCategory(@PathVariable("categoryId") Long categoryId) {
		Category category = categoryRepository.findById(categoryId);
		return category;
	}
}
