package edu.jecrc.sdt_java.java_program_structure;

import java.util.Scanner;

public class NumberApplication {

    public static void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Autobiographical auto = new Autobiographical();
        Spy spy = new Spy();

        if (auto.check(number)) {
            System.out.println(number + " is Autobiographical Number");
        } else {
            System.out.println(number + " is NOT Autobiographical Number");
        }

        if (spy.check(number)) {
            System.out.println(number + " is Spy Number");
        } else {
            System.out.println(number + " is NOT Spy Number");
        }

        sc.close();
    }
}
