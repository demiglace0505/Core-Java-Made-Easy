package com.demiglace.daemon;

public class DaemonDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); //false
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
	}
}
