package concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread {
	static List<String> courses = new CopyOnWriteArrayList<String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ArrayListProblem arrayListProblem = new ArrayListProblem();
		arrayListProblem.start();
		
		courses.add("Java");
		courses.add("Python");
		courses.add("Nodejs");
		courses.add("React");
		
		Iterator<String> iterator = courses.iterator();
		while(iterator.hasNext()) {
			Thread.sleep(3000);
			String course = iterator.next();
			System.out.println(course);
			
		}
		System.out.println(courses);
	}
}
