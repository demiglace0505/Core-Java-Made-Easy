package com.sync;

public class SynchronizationDemo {
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "doge");
		MyThread t2 = new MyThread(dm, "cate");
	
		t1.start();
		t2.start();
	}
}
