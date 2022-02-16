package com.demiglace.exceptions;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		int a, b, c;

		try {
			System.out.println("Enter two integers");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Inside Finally");
		}
		System.out.println("More code here");
	}
}
