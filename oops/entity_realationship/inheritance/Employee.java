package edu.jecrc.sdt_java.oops.entity_realationship.inheritance;

public sealed class Employee permits SoftwareDeveloper, SoftwareTester{
	int id;
	String name;
	String mailId;
	long contactNumber;
	
	static String city;
	static String state;
	static String country;
	
	public void entry() {
		System.out.println("Employee entered into the Campus!");
	}
	public void logIn() {
		System.out.println("Employee Login into the Office!");
	}
	public void meeting() {
		System.out.println("Employee is Attending the Meeting");
	}
	public void logOut() {
		System.out.println("Employee LogOut the Office!");
	}
	public void exit() {
		System.out.println("Employee exited into the Campus!");
	}
}
