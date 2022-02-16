package Runtime;

public class MacbookAir extends Macbook {
	@Override
	public void start() {
		System.out.println("MacbookAir start");
	}

	@Override
	public void shutdown() {
		System.out.println("MacbookAir shutdown");
	}
}
