package com.cjy.dmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cjy.dmg.model.Project;

@RepositoryRestResource(collectionResourceRel = "project", path = "project")
public interface ProjectRepository extends JpaRepository <Project, Long> {

}
