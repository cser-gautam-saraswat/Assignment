package edu.jecrc.sdt_java.oops.entity_relationship.association.crud;

public class Project {
	private int id;
	private String name;
	private String description;
	/**
	 * 
	 */
	public Project() {
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Project(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void displayProjecttDetails() {
		System.out.println("Project Details : ");
		System.out.println("-------------------");
		System.out.println("Id : "+getId());
		System.out.println("Name : "+getName());
		System.out.println("Description : "+ getDescription());
		System.out.println();
	}
}
