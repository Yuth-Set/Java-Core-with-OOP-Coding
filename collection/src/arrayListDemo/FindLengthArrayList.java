package arrayListDemo;

import java.util.ArrayList;

public class FindLengthArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Initial size: " + al.size());
		al.add(1);
		al.add(13);
		al.add(50);
		al.add(14);
		al.add(12);
		al.add(7);
		System.out.println("Size after few additions: " + al.size());
		al.remove(1);
		al.remove(2);
		System.out.println("Size after remore operations: " + al.size());
		System.out.println("Final ArrayList: ");
		for (int num : al) {
			System.out.println(num);
		}
	}
}
