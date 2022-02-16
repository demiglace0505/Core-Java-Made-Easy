package com.demiglace.moreinheritanceconcepts;

public class Child extends Parent {
	int c,d;
	
	Child(int a, int b, int c, int d) {
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	void f1() {
		super.f1();
		System.out.println("Inside child f1");
	}
}
