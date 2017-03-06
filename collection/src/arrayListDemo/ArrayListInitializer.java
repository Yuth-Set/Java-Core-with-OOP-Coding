package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitializer {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>(
				Arrays.asList("Dara", "Syha", "Chanda")
				);
		System.out.println("Elements are : " + obj);
			
	}
}
