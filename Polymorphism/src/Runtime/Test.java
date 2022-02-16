package Runtime;

public class Test {
	public static void main(String[] args) {
		AppleLaptop m1 = new MacbookPro();
		AppleLaptop m2 = new MacbookAir();
		
		m1.start();
		m2.start();
		
		MacbookPro m3 = (MacbookPro) m1; 
		m3.proMethod();
		
		m1.shutdown();
		m2.shutdown();
	}
}
