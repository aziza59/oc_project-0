package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	//declaration variable InventoryPrice//
	private double price, inventoryprice;

	public Product(int id, int quantity, double price, String name, String description, double inventoryprice) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
		//adding function setInventoryPrice
		setInventoryPrice(inventoryprice);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		//return value is not null
		return inventoryprice;
	}
	
	public void setInventoryPrice(double inventoryprice) {
		//function return value is not null in inventory price
		//contructor is modified ,i must be update the file product.java
		this.inventoryprice=inventoryprice
	}
}
