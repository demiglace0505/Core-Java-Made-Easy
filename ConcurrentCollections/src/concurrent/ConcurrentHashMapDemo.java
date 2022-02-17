package concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMapDemo extends Thread {
	static ConcurrentHashMap<String, String> courses = new ConcurrentHashMap<String, String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.put("Kubernetes", "5");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
		arrayListProblem.start();
		
		courses.put("Java", "3.9");
		courses.put("Python", "5.0");
		courses.put("Ruby", "4.5");
		courses.put("C", "4.6");
		
		Iterator<String> iterator = courses.keySet().iterator();
		while(iterator.hasNext()) {
			Thread.sleep(3000);
			String course = iterator.next();
			System.out.println(courses.get(course));
			
		}
		System.out.println(courses);
	}
}
