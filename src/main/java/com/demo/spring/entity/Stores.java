package com.demo.spring.entity;

public class Stores {
	private int id;
	private Cats cats;
	private int quantity;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cats getCats() {
		return cats;
	}
	public void setCats(Cats cats) {
		this.cats = cats;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stores [id=" + id + ", cats=" + cats + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
