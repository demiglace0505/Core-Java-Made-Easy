package java11;

import java.util.stream.Collectors;

public class StringUpdates {
	public static void main(String[] args) {
		String str = "           ";
		System.out.println(str.isBlank());
		
		str = "Serialize yourself. \nClose the World. \nOpen the Next.";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		
		char c = '\u2000';
		str += c;
		System.out.println(str.strip());
		
		System.out.println("=".repeat(100));
	}
}
