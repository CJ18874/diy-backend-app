package com.cjy.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjy.diy.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {	
}
