package com.demiglace.assertions;

public class AssertionsDemo {
	public static void main(String[] args) {
		int withdraw = 100;
		int balance = 50;

		assert (withdraw <= balance) : "amount to be withdrawed is more than the balance";
	}
}
