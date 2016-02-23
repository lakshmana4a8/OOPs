package com.blcoking.methods;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {
	public static void main(String args[]) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();// Creating shared object
		Thread prodThread = new Thread(new Producer(sharedQueue));// Creating Producer and Consumer Thread
		Thread consThread = new Thread(new Consumer(sharedQueue));
		prodThread.start();// Starting producer and Consumer thread
		consThread.start();
	}
}

// Producer Class in java
class Producer implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;
	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);
				//Thread.currentThread().sleep(2000L);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,null, ex);
			}
		}
	}

}

// Consumer Class in Java
class Consumer implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;
	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		while (true) {
			try {
				int count = sharedQueue.take();
				System.out.println(count+ " :Consumed   : " + sharedQueue);
				if(count >= 9){
					System.exit(0);
				}
			} catch (Exception ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE,null, ex);
			}
		}
	}

}