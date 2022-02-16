package com.demiglace.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
		CheckProcessorTask[] cps = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask checkProcessorTask : cps) {
			service.submit(checkProcessorTask);
		}
		
		service.shutdown();
	}
}
