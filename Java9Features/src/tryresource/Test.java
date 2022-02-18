package tryresource;

public class Test {

	public static void main(String[] args) {
		//before:
		//try (MyWorker worker = new Worker()) {
		MyWorker worker = new MyWorker();
		try (worker) {
			worker.doSomething();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
