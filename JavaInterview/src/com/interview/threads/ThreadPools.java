package com.interview.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=10;i<10;i++){
			Runnable worker = new WorkerThread(""+i);
			executorService.execute(worker);
		}
		executorService.shutdown();
		while(!executorService.isTerminated()){	}
		System.out.println("Finished all Threads");
	}
}
