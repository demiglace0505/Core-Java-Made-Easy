package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("F");
		l.add("N");
		l.add("C");
		l.add("A");
		System.out.println("Before sort: " + l);
		Collections.sort(l);
		// Collections.sort(l, new MyComparator());
		
		System.out.println("After sort: " + l);
		
		int result = Collections.binarySearch(l, "N");
		System.out.println("index of N is " + result);
	}
}
