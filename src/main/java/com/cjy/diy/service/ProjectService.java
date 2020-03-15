package com.cjy.dmg.service;

import java.util.List;
import java.util.Optional;

import com.cjy.dmg.model.Project;
import com.cjy.dmg.model.dto.ProjectDto;

public interface ProjectService {
	public abstract Optional<Project> findById(int id);
	public abstract List<ProjectDto> findByCategoryId(int categoryId);
}
