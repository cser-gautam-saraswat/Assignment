package edu.jecrc.sdt_java.practice;

import java.util.Scanner;

public class JavaApp {

    public static void execute() {

        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter the Number to Verify: ");
        int num = sc.nextInt();
        
        VerifierService vs = new VerifierService();
        vs.numberVerifier(num);
        
        System.out.println("Enter the Character to Verify: ");
        char ch= sc.next().charAt(0);
        
        vs.characterVerifier(ch);
        
        sc.close();
    }
}
