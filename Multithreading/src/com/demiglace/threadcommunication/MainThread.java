package com.demiglace.threadcommunication;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		synchronized(t) {
			System.out.println("Main Thread is going to wait");
			t.wait();
			System.out.println("Main Thread notified");
			System.out.println(t.total);
		}
	}
}
