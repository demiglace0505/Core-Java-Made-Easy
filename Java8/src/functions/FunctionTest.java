package functions;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("Doge"));
		System.out.println(f.apply("the quick brown fox jumps over the lazy doge"));
	}
}
