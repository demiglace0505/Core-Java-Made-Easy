package list;

import java.util.HashSet;
import java.util.Random;

public class DifferentSets {
	public static void main(String[] args) {
		Random obj = new Random();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
	}
}
