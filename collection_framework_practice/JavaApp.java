package collection_framework_practice;

import java.util.*;

public class JavaApp {

    public static void execute() {

        try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> list = new ArrayList<>();

			StudentCRUD crud = new StudentCRUD();

			while (true) {

			    System.out.println("\n---- Student CRUD System ----");
			    System.out.println("1 Add Student");
			    System.out.println("2 Display Students");
			    System.out.println("3 Update Student");
			    System.out.println("4 Delete Student");
			    System.out.println("5 Exit");

			    System.out.print("Enter choice: ");
			    int ch = sc.nextInt();

			    switch (ch) {

			        case 1:
			            crud.addStudent(list);
			            break;

			        case 2:
			            crud.displayStudents(list);
			            break;

			        case 3:
			            crud.updateStudent(list);
			            break;

			        case 4:
			            crud.deleteStudent(list);
			            break;

			        case 5:
			            System.exit(0);

			        default:
			            System.out.println("Invalid Choice");
			    }
			    
			}
		}
        
    }

}
