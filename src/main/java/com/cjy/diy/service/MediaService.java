package com.cjy.diy.service;

import java.util.List;

import com.cjy.diy.model.dto.MediaDto;

public interface MediaService {
	public abstract List<MediaDto> findByProjectId(int projectId);
}
