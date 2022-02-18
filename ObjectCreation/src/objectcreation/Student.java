package objectcreation;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class Student {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException {
		// Using new opreator
		Student s1 = new Student();
		
		// Using Class.forName (deprecated)
		// Class.forName("objectcreation.Student").newInstance();
		
		// Using instance of class
		Student s2 = Student.class.getConstructor().newInstance();
			
		// Using clone
		Student s3 = (Student) s1.clone();
		
		// Using Factory methods
		DateFormat dateFormat = DateFormat.getInstance();
	}
}
