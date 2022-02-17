package generics;

import java.util.ArrayList;

public class WildcardParams {
	
	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
		wcp.myMethod(new ArrayList<Thread>());
	}

	public void myMethod(ArrayList<? extends Thread> l) {
	}
}
