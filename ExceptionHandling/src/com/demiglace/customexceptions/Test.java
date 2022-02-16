package com.demiglace.customexceptions;

public class Test {
	public static void main(String[] args) throws CheckedCustomException {
//		throw new UncheckedCustomException("CUSTOM ERROR MESSAGE HERE");
		throw new CheckedCustomException("CUSTOM EXCEPTION THAT NEEDS TO BE HANDLED");
	}
}
