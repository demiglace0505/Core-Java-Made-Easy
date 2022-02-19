package java13and14;

public class InstanceofPatternMatchingDemo {
	public static void main(String[] args) {
		Object object = get();
		if(object instanceof String str) {
			// String str = (String) object;
			System.out.println(str);
		}
	}
	
	public static Object get() {
		return "Pattern Matching in action";
	}
}
