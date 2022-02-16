package com.demiglace.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x;
		
		int a = 10;
		int b = a++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("----");
		System.out.println(a);
		System.out.println(b);
	}

}
