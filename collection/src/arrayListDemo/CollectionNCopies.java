package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionNCopies {

	public static void main(String[] args) {
		ArrayList<Integer> inList = new ArrayList<>(Collections.nCopies(10,  5));
		System.out.println("ArrayList items : " + inList);
	}
}
