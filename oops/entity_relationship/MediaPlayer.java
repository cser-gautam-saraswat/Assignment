package edu.jecrc.sdt_java.oops.entity_relationship;

public class MediaPlayer {
	private String brand;
	private String name;
	private double price;
	
	
	
	/**
	 * @param brand
	 * @param name
	 * @param price
	 */
	public MediaPlayer(String brand, String name, double price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayMediaDetails() {
		System.out.println("Media Payer details");
		System.out.println("---------------------");
		System.out.println("Brand : " + getBrand());
		System.out.println("Name : "+ getName());
		System.out.println("Price : "+ getPrice());
		System.out.println();
	}
	
}
