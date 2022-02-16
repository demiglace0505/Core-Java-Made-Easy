package com.demiglace.moreinheritanceconcepts;

public class ChildClass extends SuperClass{
	public ChildClass() {
		this(10);
		System.out.println("NO ARG CHILDCLASS CONSTRUCTOR");
	}
	
	public ChildClass(int x) {
		super(x);
		System.out.println("1 ARG CHILDCLASS CONSTRUCTOR");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
	}
}
