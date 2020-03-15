package com.cjy.dmg.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjy.dmg.model.dto.MediaDto;
import com.cjy.dmg.service.MediaServiceImpl;

@RestController
@RequestMapping("/api/media")
public class MediaController {

	private static final Logger logger = LoggerFactory.getLogger(MediaController.class);
	@Autowired
	private MediaServiceImpl service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findByProjectId(@RequestParam(name = "projectId", required = true) String projectId) {
		logger.info("** start findByProjectId **");
		logger.info("projectId "+projectId);
		
		Optional<List<MediaDto>> project = Optional.ofNullable(service.findByProjectId(Integer.valueOf(projectId)));
		return project.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
