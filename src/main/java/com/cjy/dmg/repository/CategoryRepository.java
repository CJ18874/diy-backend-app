package com.cjy.dmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjy.dmg.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
