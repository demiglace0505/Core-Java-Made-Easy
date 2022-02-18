package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Class<?> myClass;
		try {
			myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			Constructor<?> constructor = myClass.getConstructor(double.class, double.class);
			Object myObj = constructor.newInstance(5,10);
			
		
			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 6);
			
			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 8);
			
			Method method = myClass.getMethod("getNum1", null);
			System.out.println(method.invoke(myObj, null));
			
			Method method2 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
