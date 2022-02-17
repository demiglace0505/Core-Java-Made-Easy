package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Doge", 70);
		map.put("Cate", 60);
		map.put("Fishe", 50);
		map.put("Monke", 100);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys: " + keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values: " + values);
		
		for (String key : keySet) {
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
	}
}
