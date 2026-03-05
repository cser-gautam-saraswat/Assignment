package edu.jecrc.sdt_java.class_object;

public class Product {
	int id;
	String brand;
	String name;
	double price;
	/**
	 * @param id
	 * @param brand
	 * @param name
	 * @param price
	 */
	public Product(int id, String brand, String name, double price) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Brand: " + brand + ", Cost : " + price;
	}
	@Override
	public boolean equals(Object obj) {
		Product product = (Product) obj;
		
		if(this.id == product.id && this.brand.equals(product.brand) &&this.name.equals(product.name) && this.price == product.price) {
			return true;
		}
		return false;
	}
}
