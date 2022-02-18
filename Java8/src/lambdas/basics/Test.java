package lambdas.basics;

public class Test {
	public static void main(String[] args) {
		A a = new C();
		a.myMethod();
		
		A a2 = ()-> System.out.println("Inside MyMethod");
		a2.myMethod();
	}
}
