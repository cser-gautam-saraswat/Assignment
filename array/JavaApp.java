package edu.jecrc.sdt_java.array;

import java.util.Scanner;

public class JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size: " );
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n ;i ++) {
			System.out.println("Enter Value for this Particular Index : ");
			arr[i] = sc.nextInt();
		}
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
		sc.close();
		
	}
}
