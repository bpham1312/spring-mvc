package com.demo.spring.entity;

public class Cats {
	private int id;
	private String name;
	private String image;
	private String description;
	private Species species;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Species getSpecies() {
		return species;
	}
	public void setSpecies(Species species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Cats [id=" + id + ", name=" + name + ", image=" + image + ", description=" + description + ", species="
				+ species + "]";
	}
	

}
