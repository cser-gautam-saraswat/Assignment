package edu.jecrc.sdt_java.oops.entity_relationship.association.crud;

public class Department {

	private int id;
	private String name;
	private Student student;

	public Department() {
	}

	public Department(int id, String name) {
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void displayDepartmentDetails() {
		System.out.println("Department Details : ");
		System.out.println("-------------------");
		System.out.println("Id : " + getId());
		System.out.println("Name : " + getName());
		System.out.println();
	}

	public void createStudent(Student student) {
		if (student != null) {
			if ((student.getId() != 0) && (student.getName() != null)) {
				this.student = student;
				System.out.println("Student Created");
			}
		} else {
			System.out.println("Student Already Exist!");
		}
	}

	public void readStudent() {
		this.student.displayStudentDetails();
	}

	public void updateStudent(int id, String name, String mailId, long contactNumber) {
		if ((id != 0) && (name != null)) {
			if (this.getStudent().getId() == id) {
				this.getStudent().setName(name);
				this.getStudent().setMailId(mailId);
				this.getStudent().setContactNumber(contactNumber);
				System.out.println("Student Updated");
			} else {
				System.out.println("Student Not Updated");
			}
		}
	}

	public void deleteStudent(int id) {
		if (id != 0) {
			if (this.getStudent().getId() == id) {
				this.student = null;
				System.out.println("Student Deleted");
			} else {
				System.out.println("Student Not Deleted");
			}
		}
	}
}