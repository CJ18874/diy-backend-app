package com.cjy.dmg.model.dto;

public class MediaDto {
	private String url;
	private String type;
	private String description;
	private boolean mainMedia;

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
}
