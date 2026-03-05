package collection_framework;

import java.util.HashMap;


public class JavaApp {
	public static void execute() {
//		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
//		hm.put(1, 55.33);hm.put(-2, 55753.2);hm.put(3, 5.33);hm.put(4, 584.33);
//		
//		System.out.println(hm);
//		
//		HashMap<Integer, Double> hm2 = (HashMap<Integer, Double>) hm.clone();	
//		
//		System.out.println(hm.equals(hm2));
//		System.out.println(hm.hashCode());
//		System.out.println(hm2.hashCode());
		
//		int i = 10, j = 0;
//		try {
//			int k = i /j;
//			System.out.println("K is: " + k);
//			System.out.println("Trying to do something");
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("Can't divide by Zero");
//		}
		
		String s = null;
		
		try {
			System.out.println(s + " " + s.length());
		} catch (NullPointerException e) {
			System.out.println("Can't perform Anything on Null ");
		}
		
	}
}
