package lambdas.parameters;

public class Test {
	public static void main(String[] args) {
		Sum s = (a,b) -> System.out.println("Sum is: " + (a + b));
		s.add(10, 20);
	}
}
