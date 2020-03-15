package com.cjy.diy.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "serial")
	private Integer id;
	private String title;
	@Column(columnDefinition = "text")
	private String description;
	@Column(columnDefinition = "text")
	private String insperation;
	private String keyWord;
	@Column(name = "publish_date")
	private Date publishDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project2category", foreignKey = @ForeignKey(name = "fk_project_category"))
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project2owner", foreignKey = @ForeignKey(name = "fk_project_owner"))
	private Owner owner;
	@OneToMany(mappedBy = "project")
	private List<Media> mediaList;

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInsperation() {
		return insperation;
	}

	public void setInsperation(String insperation) {
		this.insperation = insperation;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Category getCategory() {
		return category;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Media> getMediaList() {
		return mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}
	
	@Override
	public String toString() {
		return "{" + "Id=" + id + ", Title='" + title + '\'' + ", Description='" + description + '\''
				+ ", Insperation='" + insperation + '\'' + ", Key Word='" + keyWord + '\'' + '}';
	}
}
