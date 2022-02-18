package lambdas.anon;

public class Test {
	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child thread");
			}
		});
		
		t.start();
		
		for (int i =1 ; i<=10; i++) {
			System.out.println("Inside main thread");
		}
	}
}
