package com.utk.shoppingbackend.dto;

public class Category {


	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActve() {
		return actve;
	}
	public void setActve(boolean actve) {
		this.actve = actve;
	}
	
	
	
	/*
	 * private fields
	 */

	private int id;
	private String name;
	private String description;
	private String imageURL;
	private boolean actve = true;	
}
