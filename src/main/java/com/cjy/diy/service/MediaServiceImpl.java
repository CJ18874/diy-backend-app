package com.cjy.diy.service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjy.diy.model.Media;
import com.cjy.diy.model.dto.MediaDto;
import com.cjy.diy.repository.MediaRepository;

@Service
public class MediaServiceImpl implements MediaService{

	private static final Logger logger = LoggerFactory.getLogger(MediaServiceImpl.class);
	@Autowired
	private MediaRepository repository;
	@Autowired
	private ModelMapper modelMapper;
	
	public List<MediaDto> findByProjectId(int projectId) {
		logger.info("** start findByProjectId **");
		
		List <Media> list = repository.findByProjectId(projectId);
		Type listType = new TypeToken<List<MediaDto>>() {}.getType();
		return modelMapper.map(list,listType);
	}
}
