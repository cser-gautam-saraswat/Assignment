package edu.jecrc.sdt_java.oops.entity_relationship;

public class Car {
	private String brand;
	private String name;
	private String make;
	private double price;
	
	private MediaPlayer mediaPlayer;
	
	private Engine engine;

	/**
	 * @param brand
	 * @param name
	 * @param make
	 * @param price
	 * @param engine
	 */
	public Car(String brand, String name, String make, double price, Engine engine) {
		this.brand = brand;
		this.name = name;
		this.make = make;
		this.price = price;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public String getMake() {
		return make;
	}

	public double getPrice() {
		return price;
	}

	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}

	public Engine getEngine() {
		return engine;
	}


	
	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public void displayCarDetails() {
		System.out.println("Car Details");
		System.out.println("--------------");
		System.out.println("Brand : " + getBrand());
		System.out.println("Name : "+ getName());
		System.out.println("Make : "+ getMake());
		System.out.println("Price : " + getPrice());
		System.out.println();
	}
	
}
