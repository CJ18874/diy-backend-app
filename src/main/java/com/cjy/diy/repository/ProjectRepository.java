package com.cjy.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjy.diy.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Integer> {
 
}
