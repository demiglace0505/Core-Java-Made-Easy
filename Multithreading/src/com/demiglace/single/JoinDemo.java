package com.demiglace.single;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n, sum;

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum);
		long endTime = System.currentTimeMillis();

		System.out.println("Total time taken " + (endTime - startTime) / 1000);
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
