package edu.jecrc.sdt_java.oops.entity_relationship.association.crud;


public class Student {	
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Project project;
	
	/**
	 * 
	 */
	public Student() {
		
	}
	public Student(int id, String name, String mailId, long contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student Details : ");
		System.out.println("-------------------");
		System.out.println("Id : "+getId());
		System.out.println("Name : "+getName());
		System.out.println("Mail Id : "+getMailId());
		System.out.println("Contact Number : "+getContactNumber());
		System.out.println();
	}
	
	public void createProject(Project project) {
		if(project != null) {
			if((project.getId() != 0) &&(project.getName() != null) && (project.getDescription() != null)) {
				this.project = project;
				System.out.println("Project Created");
				System.out.println();
			}
		}
		else {
			System.out.println("Project Already Exist!");
		}
	}
	
	public void readProject() {
		this.project.displayProjecttDetails();
	}
	
	public void updateProject(int id, String name, String description) {
		if((id !=0) &&(name != null) && (description != null)) {
			if(this.getProject().getId() == id) {
				this.getProject().setName(name);
				this.getProject().setDescription(description);
				System.out.println("Project Updated");
			}
			else {
				System.out.println("Project Not Updated");
			}
		}
	}
	
	public void deleteProject(int id) {
		if(id !=0) {
			if(this.getProject().getId() == id) {
				this.project = null;
				System.out.println("Project Deleted");
			}
			else {
				System.out.println("Project Not Deleted");
			}
		}
	}
	
	
}
