package concurrent;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {
	private BlockingQueue<String> queue; 
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			queue.put("Doge");
			queue.put("Cat");
			queue.put("Fishe");
			queue.put("Monke");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
