package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	//declaration variable InventoryPrice
	//delete InventoryPrice
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
		//adding function setInventoryPrice
		//delete InventoryPrice
		
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
		//old:this.quantity = quantity;
		//new: quantity is not negative,if value negative ,put 0
		if (quantity >= 0) {
	  	       this.quantity = quantity; 
			           }
		else {
		       this.quantity = 0;
	             }
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		//old:this.price = price;
		//price is not negative and not better than 1000 if not put value 0
		//update setprice :add space,equal
		if (price >= 0 && price <= 1000) 
			this.price = price; 
		else if (price > 1000)
			this.price = 1000;
		else
			this.price = 0;  

	}

	public double getInventoryPrice() {
		// old:TODO Auto-generated method stub
		//calculation of inventoryPrice
		return quantity*price;

	}
	
	//delete setInventoryPrice
}
