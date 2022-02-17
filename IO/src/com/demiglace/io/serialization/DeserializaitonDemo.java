package com.demiglace.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializaitonDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("C:\\Users\\ChristianCruz\\Documents\\Christian\\projects\\Core-Java-Made-Easy\\IO\\Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object object = ois.readObject();
			Employee emp = (Employee) object;
			
			System.out.println("Employee id: " + emp.id);
			System.out.println("Employee name: " + emp.name);
			System.out.println("Employee salary: " + emp.salary);
			System.out.println("Employee ssn: " + emp.ssn);
	}
}
