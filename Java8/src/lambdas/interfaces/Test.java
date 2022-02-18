package lambdas.interfaces;

public class Test {
	public static void main(String[] args) {
//		Runnable r = new MyRunnableImpl();
//		Thread t = new Thread(r);
//		t.start();
		
		Runnable r = ()-> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for (int i =1 ; i<=10; i++) {
			System.out.println("Inside main thread");
		}
	}
}
