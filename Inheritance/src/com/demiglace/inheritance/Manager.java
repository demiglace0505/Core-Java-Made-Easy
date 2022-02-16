package com.demiglace.inheritance;

public class Manager extends Employee {
	String[] projects;

	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		this.projects = projects;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("MANAGER WORK: " + projects);
		
	}
}
