package edu.jecrc.sdt_java.oops.entity_relationship.association.crud;

public class University {

	private int id;
	private String name;
	private College college;

	public University() {
	}

	public University(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	public void displayUniversityDetails() {
		System.out.println("University Details : ");
		System.out.println("-------------------");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println();
	}

	public void createCollege(College college) {
		if (college != null) {
			this.college = college;
			System.out.println("College Created");
		}
	}

	public void readCollege() {
		this.college.displayCollegeDetails();
	}

	public void updateCollege(int id, String name) {
		if((id != 0) && (name != null)) {
			if(this.getCollege().getId() == id) {
				this.getCollege().setName(name);
				System.out.println("College Updated");
			}
			else {
				System.out.println("College Not Updated");
			}
		}
	}

	public void deleteCollege(int id) {
		if(id != 0) {
			if(this.getCollege().getId() == id) {
				this.college = null;
				System.out.println("College Deleted");
			}
			else {
				System.out.println("College Not Deleted");
			}
		}
	}

	
}