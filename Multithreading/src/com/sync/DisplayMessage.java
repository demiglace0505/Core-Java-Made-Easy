package com.sync;

public class DisplayMessage {
	public void sayHello(String name) {
		// Any code can go here
		
		synchronized (this) {
			for (int i=1; i<=5; i++) {
				System.out.println("Hello " +  name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
