package com.cjy.dmg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Step {
	@Id
	@Column(name = "id", columnDefinition = "serial")
	private Integer id;
	private String header;
	private String description;
	private String tool;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="step2chapter", foreignKey = @ForeignKey(name = "fk_step_chapter"))
	private Chapter chapter;
	
	public String getHeader() {
		return header;
	}
	public String getDescription() {
		return description;
	}
	public String getTool() {
		return tool;
	}
	public Chapter getChapter() {
		return chapter;
	}
}
