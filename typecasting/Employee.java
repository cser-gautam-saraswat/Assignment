package edu.jecrc.sdt_java.typecasting;

public sealed class Employee permits SoftwareDeveloper, SoftwareTester{
	public void entry() {
		System.out.println("Employee Entered in campus");
	}
	public void exit() {
		System.out.println("Employee Exited from campus");
	}
	public void meeting() {
		System.out.println("Employee is attending the meeting");
		System.out.println();
	}
}
