package edu.jecrc.sdt_java.oops.entity_realationship.inheritance;

public class Student {
	final int id;
	final String name;
	final String mailId;
	final long contactNumber;
	
	final static String city;
	final static String state;
	final static String country;
	/**
	 * @param id
	 * @param name
	 * @param mailId
	 * @param contactNumber
	 */
	public Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	
	static {
		city = "Jaipur";
		state = "Rajasthan";
		country = "India";
	}
	public void studentDetails() {
		System.out.println("Student Details: ");
		System.out.println("--------------------------------");
		System.out.println("Id: "+ id);
		System.out.println("Name: " + name);
		System.out.println("Mail Id : "+ mailId);
		System.out.println("Contact: " + contactNumber);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Country: "+ country);
	}
}
