package com.cjy.diy.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {
	@Id
	private Integer id;
	private String name;
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category2parentcategory", foreignKey = @ForeignKey(name = "fk_category_parentcategory"))
	private Category parentCategory;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Category getParentCategory() {
		return parentCategory;
	}
	
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
}
