package com.cjy.dmg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjy.dmg.model.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {

	List<Media> findByProjectId(int projectId);
}
