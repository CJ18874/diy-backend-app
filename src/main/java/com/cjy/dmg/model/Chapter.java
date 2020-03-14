package com.cjy.dmg.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Chapter")
@Table(name = "chapter")
public class Chapter {
	@Id
	@Column(columnDefinition = "serial")
	private Integer id;
	private String title;
	@Column(name="publish_date")
	private Date publishDate;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="chapter2project",foreignKey=@ForeignKey(name="fk_chapter_projec"))
	private Project project;
	
	public Integer getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public Project getProject() {
		return project;
	}
}
