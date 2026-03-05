package collection_framework_practice;

import java.util.*;

public class StudentCRUD {
	private int nextId = 1;

    Scanner sc = new Scanner(System.in);

    public void addStudent(ArrayList<Student> list) {

        System.out.print("How many students you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            int id = nextId++;   

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Email:");
            String email = sc.nextLine();

            System.out.println("Enter Age:");
            int age = sc.nextInt();
            sc.nextLine();

            Student s = new Student(id, name, email, age);
            list.add(s);
        }

        System.out.println("Students Added Successfully");
    }

    public void displayStudents(ArrayList<Student> list) {

        for (Student s : list) {

            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Age: " + s.getAge());
            System.out.println("------------------");
        }
    }

    public void updateStudent(ArrayList<Student> list) {

        System.out.println("Enter ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : list) {

            if (s.getId() == id) {

                System.out.println("What do you want to update?");
                System.out.println("1. Email");
                System.out.println("2. Age");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter new Email:");
                        s.setEmail(sc.nextLine());
                        System.out.println("Email Updated");
                        break;

                    case 2:
                        System.out.println("Enter new Age:");
                        s.setAge(sc.nextInt());
                        System.out.println("Age Updated");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void deleteStudent(ArrayList<Student> list) {

        System.out.println("Enter ID to delete:");
        int id = sc.nextInt();

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {

            Student s = it.next();

            if (s.getId() == id) {

                it.remove();
                System.out.println("Student Deleted");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}
