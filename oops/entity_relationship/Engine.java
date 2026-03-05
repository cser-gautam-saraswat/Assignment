package edu.jecrc.sdt_java.oops.entity_relationship;

public class Engine {
	private double cc;
	private String coolingSystem;
	private int cylinderNumber;
	
	public Engine(double cc, String coolingSystem, int cylinderNumber) {
		this.cc = cc;
		this.coolingSystem = coolingSystem;
		this.cylinderNumber = cylinderNumber;
	}
	
	public double getCc() {
		return cc;
	}
	
	public void setCc(double cc) {
		this.cc = cc;
	}
	
	public String getCoolingSystem() {
		return coolingSystem;
	}
	
	public void setCoolingSystem(String coolingSystem) {
		this.coolingSystem = coolingSystem;
	}
	
	public int getCylinderNumber() {
		return cylinderNumber;
	}
	
	public void setCylinderNumber(int cylinderNumber) {
		this.cylinderNumber = cylinderNumber;
	}
	
	public void displayEngineDetails() {
		System.out.println("Engine details");
		System.out.println("---------------------");
		System.out.println("CC : " + getCc());
		System.out.println("Cooling Sytem : "+ getCoolingSystem());
		System.out.println("Cylinder Number : "+ getCylinderNumber());
		System.out.println();
	}
}
	
