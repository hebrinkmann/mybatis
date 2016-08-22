package de.henningBrinkmann.mybatisSample.entity;

public class Source {
	private int id;
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return String.format("Source [id=%s, url=%s]", id, url);
	}
}
