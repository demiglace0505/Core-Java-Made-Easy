package methodref;

public class MyClass {
	public void myMethod123(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		MyInterface f = i->System.out.println(i);
		f.myMethod(10);
		
		// Mapping to functional interface
		MyClass c = new MyClass();
		MyInterface f1 = c::myMethod123;
		f1.myMethod(20);
	}
}
