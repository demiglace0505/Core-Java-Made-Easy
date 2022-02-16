package com.demiglace.moreinheritanceconcepts;

public class SuperClass {
	int x;
	public SuperClass() {
		System.out.println("NO ARG SUPERCLASS CONSTRUCTOR");
	}
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("1 ARG SUPERCLASS CONSTRUCTOR");
	}
}
