package edu.jecrc.sdt_java.oops.entity_relationship.association.crud;

public class College {

	private int id;
	private String name;
	private Department department;

	public College() {
	}

	public College(int id, String name) {
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void displayCollegeDetails() {
		System.out.println("College Details : ");
		System.out.println("-------------------");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println();
	}
	
	public void createDepartment(Department department) {
		if (department != null) {
			this.department = department;
			System.out.println("Department Created");
		}
	}

	public void readDepartment() {
		this.department.displayDepartmentDetails();
	}

	public void updateDepartment(int id, String name) {
		if((id != 0) && (name !=  null)) {
			if (this.getDepartment().getId() == id) {
				this.getDepartment().setName(name);
				System.out.println("Department Updated");
			}else {
				System.out.println("Department Not Updated");
			}
		}
	}

	public void deleteDepartment(int id) {
		if(id != 0) {
			if (this.getDepartment().getId() == id) {
				this.department = null;
				System.out.println("Department Deleted");
			}else {
				System.out.println("Department Not Deleted");
			}
		}
	}
}