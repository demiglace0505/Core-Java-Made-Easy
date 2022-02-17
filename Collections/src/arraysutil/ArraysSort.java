package arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraysSort {
	public static void main(String[] args) {
		String[] s = {"D", "O", "G", "E"};
		System.out.println("Array:");
		for (String string : s) {
			System.out.println(string);
		}
		
		List<String> list = Arrays.asList(s);
		s[0] = "Y";
		System.out.println("List: " + list);
	}
}
