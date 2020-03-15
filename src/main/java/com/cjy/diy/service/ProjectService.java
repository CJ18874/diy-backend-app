package com.cjy.diy.service;

import java.util.List;
import java.util.Optional;

import com.cjy.diy.model.Project;
import com.cjy.diy.model.dto.ProjectDto;

public interface ProjectService {
	public abstract Optional<Project> findById(int id);
	public abstract List<ProjectDto> findByCategoryId(int categoryId);
}
