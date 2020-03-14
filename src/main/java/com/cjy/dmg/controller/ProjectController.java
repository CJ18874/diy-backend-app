package com.cjy.dmg.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjy.dmg.model.Project;
import com.cjy.dmg.model.dto.ProjectDto;
import com.cjy.dmg.service.ProjectServiceImpl;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	@Autowired
	private ProjectServiceImpl service;
	
	/**
	 * /api/project?categoryId=1
	 * 
	 * @param projectId
	 * @return
	 */
	public ResponseEntity<?> findById(@PathVariable String projectId) {
		logger.info("** start findById **");
		
		Optional<Project> project = service.findById(Integer.valueOf(projectId));
		return project.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@RequestMapping(method=RequestMethod.GET)
	public  ResponseEntity<?> findByCategoryId(@RequestParam(name = "categoryId" ,required=true) String categoryId) {
		logger.info("** start findByCategoryId **");
				
		Optional<List<ProjectDto>> project = Optional.ofNullable(service.findByCategoryId(Integer.valueOf(categoryId)));
		return project.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
