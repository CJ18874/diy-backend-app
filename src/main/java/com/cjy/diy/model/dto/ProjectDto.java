package com.cjy.dmg.model.dto;

import java.sql.Date;
import java.util.List;

import com.cjy.dmg.model.Media;

public class ProjectDto {
	private int id;
	private String title;
	private String insperation;
	private String keyWord;
	private Date publishDate;
	private String ownerName;
	private List<Media> mediaList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public List<Media> getMediaList() {
		return mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

}
