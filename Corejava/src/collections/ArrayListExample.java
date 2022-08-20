package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"abc", "pqr", "xyz", "asd", "fgh"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("John");
		list1.add("Leeana");
		list1.add("Priyanka");
		list1.add("Rohan");
	    list1.add("Laurence");
	    
	    
		System.out.println("List is this " + list1);
		System.out.println("Size of ArrayList is " + list1.size());
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		
		list1.remove(1);
		System.out.println("List is this " + list1);
		System.out.println("Size of ArrayList is " + list1.size());
		
		System.out.println("The data at 4th position is " + list1.get(3));
		
		list1.set(0, "James");
		System.out.println("List is this after replacing John " + list1);
		
		list1.add(2, "Leeana");
		System.out.println("List is this after adding Leeana again " + list1);
		
		Collections.sort(list1);
		System.out.println("List is this after sort " + list1);
		
		//Collections.sort(list1, Collections.reverseOrder());
		//System.out.println("List is this after reverse sort order " + list1);
		
		//for(int index=0; index<list1.size(); index++) {
		//	System.out.println(list1.get(index));
		//}
		
		//for(String name:list1) {
		//	System.out.println(name);
		//}

		for(int index=0; index<list1.size(); index++) {
			if(list1.get(index).equals("Priyanka")) {
				System.out.println(index);
				break;
			}
		}
		
		
	}

}
