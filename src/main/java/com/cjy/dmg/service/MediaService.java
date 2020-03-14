package com.cjy.dmg.service;

import java.util.List;

import com.cjy.dmg.model.dto.MediaDto;

public interface MediaService {
	public abstract List<MediaDto> findByProjectId(int projectId);
}
