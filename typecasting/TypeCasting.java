package edu.jecrc.sdt_java.typecasting;

public class TypeCasting {
	public static void widening() {
		int i =10;
		
		double d = i;
		
		System.out.println(d);
		System.out.println();
				
	}
	public static void narrowing() {
		double d = 12.32;
		
		int i = (int) d;
		
		System.out.println(i);
		System.out.println();
				
	}
	public static void charToInt(char ch) {
		int i = 'A';
		
		char cah = (char) 126;
		System.out.println(cah + " " + i);
				
	}
	
	public static void boxing() {
		int i = 10;
		System.out.println(i);
		Integer I = Integer.valueOf(i);
		System.out.println(I);
		System.out.println();
	}
	public static void unBoxing() {
		Integer I = Integer.valueOf(10);
		System.out.println(I);
		int i = I.intValue();
		System.out.println(i);
		System.out.println();
	}
}
