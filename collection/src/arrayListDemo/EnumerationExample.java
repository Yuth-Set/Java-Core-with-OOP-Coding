package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationExample {

	public static void main(String[] args) {
		//Create an arrayList object
		ArrayList<String> arrayList = new ArrayList<>();
		//Add elements to ArrayList
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Java");
		arrayList.add("PHP");
		arrayList.add("Spring framework");
		// Get the Enumeration object
		Enumeration<String> e = Collections.enumeration(arrayList);
		//Enumerate through the ArrayList elements
		System.out.println("ArrayList elements: ");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
