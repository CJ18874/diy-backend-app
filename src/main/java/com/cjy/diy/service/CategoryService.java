package com.cjy.diy.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.cjy.diy.model.Category;
import com.cjy.diy.repository.CategoryRepository;

@Service
public class CategoryService {
	private static final Logger logger = LoggerFactory.getLogger(CategoryService.class);
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		logger.info("** start findAll **");
		
		return repository.findAll();
	}

	public List<Category> findAllParent() {
		logger.info("** start findAllParent **");

		Category categoryExample = new Category();
		categoryExample.setParentCategory(null);
		return repository.findAll(Example.of(categoryExample));
	}
	
	public List<Category> findAllSubCategory(Category parent) {
		logger.info("** start findAllSubCategory **");

		Category categoryExample = new Category();
		categoryExample.setParentCategory(parent);
		return repository.findAll(Example.of(categoryExample));
	}
	
}
