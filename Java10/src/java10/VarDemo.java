package java10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarDemo {
	public static void main(String[] args) {
		var map = new HashMap<String, List<String>>();
		
		//for(Map.Entry<String, List<String>> entry:map.entrySet()) {
		//	
		//}
		for (var entry:map.entrySet()) {
			//List<String> value = entry.getValue();
			var value = entry.getValue();
		}
	}
}
