package collection_framework_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaApp {
	public static void execute() {
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(1);al.add(2);al.add(-9);al.add(8);
//		System.out.println(al);
//				
//
//		ArrayList<Integer> al2 = (ArrayList<Integer>) al.clone();
//		System.out.println(al == al2);
//		System.out.println(al2);
//		
//		System.out.println(al.equals(al2));
//		System.out.println(al.hashCode());
//		System.out.println(al2.hashCode());
		
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		al1.add(1);
//		al1.add(2);
//		al1.add(3);
//		al1.add(4);
//		Iterator<Integer> iterator = al1.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println();
//		
//		ListIterator<Integer> listIterator = al1.listIterator(4);
		
//		while(listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}
//		
//		al1.add(2, 33);
//		al1.remove(1);
//		System.out.println(al1);
		
		
		HashSet<Character> hs1 = new HashSet<Character>();
		hs1.add('w');hs1.add('*');hs1.add('I');
		
		HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();
		
		System.out.println(hs1);
		System.out.println(hs2);
		System.out.println(hs1.equals(hs2));
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		
		Iterator<Character> iterator = hs1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		hs1.remove('w');
		System.out.println(hs1);
		System.out.println();
		
		
		
		
		
	}
}
