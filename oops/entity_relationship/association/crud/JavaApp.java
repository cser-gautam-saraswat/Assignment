package edu.jecrc.sdt_java.oops.entity_relationship.association.crud;

public class JavaApp {
	public static void execute() {
		University university = new University(1, "JECRC University");
		College college = new College(101, "Engineering College");
		Department department = new Department(201, "Computer Science");
		Student student = new Student(1, "Gautam", "gautam@gmail.com", 789654123);
		Project project = new Project(1, "Reservation System", "reverse description");
		
//		student.displayStudentDetails();
		university.createCollege(college);
		university.readCollege();
		
		college.createDepartment(department);
		college.readDepartment();
		
		department.createStudent(student);
		department.readStudent();
		
		student.createProject(project);
		student.readProject();
		
		project.displayProjecttDetails();
		
//		project.displayProjecttDetails();
		
//		
//		
//		student.readProject();
//		
//		student.updateProject(1, "Train Reservation", "Spring Ai Based Java Web App");
//		
//		student.deleteProject(1);
//		
//		student.readProject(); // this will throw null because project is deleted
		
		
	}
}
