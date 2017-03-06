package arrayListDemo;

import java.util.ArrayList;

public class InitializationExample2 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>(){{
			add("Rotha");
			add("Vannib");
			add("Vichet");
		}};
		System.out.println("Content of Array list cities: " + cities);
	}
}
