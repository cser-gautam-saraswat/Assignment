package edu.jecrc.sdt_java.typecasting;


public class JavaApp {
	public static void execute() {
		Employee employee = new SoftwareDeveloper();
		employee.entry();
		employee.meeting();
		employee.exit();
		
		SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper)employee;
		softwareDeveloper.task();
		softwareDeveloper.reverseKT();
		
		Employee employee2 = new SoftwareTester();
		SoftwareTester softwareTester = (SoftwareTester) employee2;
		
		softwareTester.task();
		softwareTester.reverseKT();
		
	}
}
