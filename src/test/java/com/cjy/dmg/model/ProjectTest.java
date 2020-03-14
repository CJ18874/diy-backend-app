package com.cjy.dmg.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.cjy.dmg.model.dto.ProjectDto;

public class ProjectTest {
	private static final ModelMapper modelMapper = new ModelMapper();

	@Test
	public void checkProjectMapping() {
		ProjectDto dto = new ProjectDto();
		dto.setId(3);

		Project project = modelMapper.map(dto, Project.class);
		assertEquals(dto.getId(), project.getId());
	}
}
