/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_realationship.inheritance;

/**
 * 
 */
public final class SoftwareDeveloper extends Employee{
	/**
	 * @param designation
	 * @param salary
	 * @param role
	 * @param incentive
	 */
	public SoftwareDeveloper(int id,String name, String designation, double salary, String role, double incentive) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.role = role;
		this.incentive = incentive;
	}

	String designation;
	double salary;
	String role;
	double incentive;
	
	static String department;
	static String branch;
	static String company;
	
	static {
		department = "Software Development";
		branch = "Jaipur";
		company = "CapG";
		city = "Jaipur";
		state = "Rajasthan";
		country = "India";
	}
	
	public void task() {
		System.out.println("Software Development");
	}
	
	public void reverseKT() {
		System.out.println("Explanation about Latest Software Development tools and Tech");
	}
	
	public void softwareDeveloperDetails() {
		System.out.println("Software Developers Details: ");
		System.out.println("--------------------------------");
		System.out.println("Id: "+ id);
		System.out.println("Name: " + name);
		System.out.println("Dedpartment: " + department);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Country: "+ country);
	}
}
