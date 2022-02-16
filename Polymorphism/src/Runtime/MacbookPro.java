package Runtime;

public class MacbookPro extends Macbook {
	@Override
	public void start() {
		System.out.println("MacbookPro start");
	}

	@Override
	public void shutdown() {
		System.out.println("MacbookPro shutdown");
	}
	
	public void proMethod() {
		System.out.println("Macbook Pro advanced feature");
	}
}
