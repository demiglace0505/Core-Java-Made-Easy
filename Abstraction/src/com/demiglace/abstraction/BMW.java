package com.demiglace.abstraction;

public abstract class BMW {
	void commonFunc() {
		System.out.println("Inside commonFunc method");
	}
	
	abstract void accelerate();
	abstract void brake();
	
	public static void main(String[] args) {
		System.out.println("Inside abstract main");
	}
}
