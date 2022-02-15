package Hello;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("inside main");
		StaticMethodsDemo.method1();
	}

	static void method1() {
		System.out.println("Inside static method");
	}
	
	static {
		System.out.println("Inside static block");
		StaticMethodsDemo.method1();
	}
}
