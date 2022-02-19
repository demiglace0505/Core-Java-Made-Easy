package java12.stringapi;

public class StringFeatures {
	public static void main(String[] args) {
		String s = "   Serialize Youself.";
		System.out.println(s);
		System.out.println(s.indent(5));
		System.out.println(s.indent(-2));
		
		String s1 = "10";
		Integer result = s1.transform(Integer::parseInt);
		System.out.println(result);
	}
}
