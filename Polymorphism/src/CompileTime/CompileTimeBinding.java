package CompileTime;

public class CompileTimeBinding {

	void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(5.2f, 1.2f);
		obj.add(1, 2, 3);
		obj.add(0, 1);
	}
}
