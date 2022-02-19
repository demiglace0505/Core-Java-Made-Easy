package java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamtoList {
	public static void main(String[] args) {
		List<String> ids = Arrays.asList("123", "456", "789");
		// List<Integer> idsAsInt = ids.stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> idsAsInt = ids.stream().map(Integer::parseInt).toList();
	}
}
