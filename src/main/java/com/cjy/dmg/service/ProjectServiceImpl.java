package com.cjy.dmg.service;

import java.util.List;
import java.util.Optional;
import java.lang.reflect.Type;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.cjy.dmg.model.Category;
import com.cjy.dmg.model.Project;
import com.cjy.dmg.model.dto.ProjectDto;
import com.cjy.dmg.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);
	@Autowired
	private ProjectRepository repository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Optional<Project> findById(int id) {
		logger.info("** start findById **");
		
		return repository.findById(id);
	}

	@Override
	public List<ProjectDto> findByCategoryId(int categoryId) {
		logger.info("** start findByCategoryId **");
		
		// create project example 
		Project projectExample = new Project();
		Category category = new Category();
		category.setId(categoryId);
		projectExample.setCategory(category);
		// find all relevant projects 
		List<Project> list = repository.findAll(Example.of(projectExample));
		// map list<project> -> list<dto>
		Type listType = new TypeToken<List<ProjectDto>>() {}.getType();
		// return dto list
		return modelMapper.map(list,listType);
	}
}
