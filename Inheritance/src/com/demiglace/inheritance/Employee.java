package com.demiglace.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	protected final void work() {
		System.out.println("COMMON WORK FOR EVERYONE");
	}
}
