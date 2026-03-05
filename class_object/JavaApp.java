/**
 * 
 */
package edu.jecrc.sdt_java.class_object;

/**
 * 
 */
public class JavaApp {
	public static void execute() {
		
		Product product1 = new Product(1, "Apsara", "Pencil", 50);
		System.out.println(product1.toString());
		
		Product product2 = new Product(2, "Apsara2", "Pencil2", 50.256);
		System.out.println(product2);
	}
}
