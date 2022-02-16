package com.demiglace.abstraction;

public class Test {
	public static void main(String[] args) {
		ThreeSeries three = new ThreeSeries();
		FiveSeries five = new FiveSeries();
		three.accelerate();
		three.commonFunc();
		five.accelerate();
		five.commonFunc();
	}
}
