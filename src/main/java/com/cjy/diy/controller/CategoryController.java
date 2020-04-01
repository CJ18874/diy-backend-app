package com.cjy.diy.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjy.diy.model.Category;
import com.cjy.diy.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	@Autowired
	private CategoryService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		logger.info("** start findAll **");
		
		Optional<List<Category>> project = Optional.ofNullable(service.findAll());
		return project.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/parent")
	public ResponseEntity<?> findAllParent() {
		logger.info("** start findAllParent **");
		
		Optional<List<Category>> project = Optional.ofNullable(service.findAllParent());
		return project.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/sub-category")
	public ResponseEntity<?> findAllSubCategory() {
		logger.info("** start findAllSubCategory **");
		return null;
//		Optional<List<Category>> project = Optional.ofNullable(service.findAllSubCategory(parent));
//		return project.map(response -> ResponseEntity.ok().body(response))
//				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
