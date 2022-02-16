package com.demiglace.single;

public class Multithreaded extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Multithreaded mt = new Multithreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();
		
		Multithreaded mt1 = new Multithreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();

		
//		for (int j = 1; j <= 200; j++) {
//			System.out.print("j: " + j + "\t");
//			Thread.sleep(1000);
//		}
	}

	public void run() {
		System.out.println("thread name: " + Thread.currentThread().getName());
		
//		for (int i = 1; i <= 200; i++) {
//			System.out.print("i: " + i + "\t");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
