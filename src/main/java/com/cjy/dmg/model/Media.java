package com.cjy.dmg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Integer id;
	private String url;
	private String type;
	private String description;
	@Column(name = "main_media")
	private boolean mainMedia;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "media2step", foreignKey = @ForeignKey(name = "fk_media_step"))
	private Step step;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "media2project", foreignKey = @ForeignKey(name = "fk_media_project"))
	private Project project;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMainMedia() {
		return mainMedia;
	}

	public void setMainMedia(boolean mainMedia) {
		this.mainMedia = mainMedia;
	}

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	@Override
	public String toString() {
		return "{" + "Id=" + id + ", Url='" + url + '\'' + ", Type='"
				+ type + '\'' + ", Description='" + description + '\'' + ", Main Media='" + mainMedia + '\'' + '}';
	}
}
