package com.demiglace.staticinner;

public class Outer {

	static void f1() {
		System.out.println("Outers static method");
	}

	static class Inner {
		// static inner class method
		static void f2() {
			System.out.println("Inners static method");
		}
		// non static inner class method
		void f3() {
			System.out.println("inners non static method");
		}
	}

	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();
		Outer.Inner inner = new Outer.Inner();
		inner.f3();
	}
}
