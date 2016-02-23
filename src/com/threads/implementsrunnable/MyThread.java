package com.threads.implementsrunnable;

public class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("thread running...... : "+Thread.currentThread().getName());
		for (int x = 1; x < 4; x++) {
			System.out.println("Runnable running : "+x+" : "+Thread.currentThread().getName());
			try {
				 Thread.sleep(1000);
			} catch (InterruptedException ex) { }
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		Thread thread1 = new Thread(thread,"thread - 1");
		Thread thread2 = new Thread(thread,"thread - 2");
		Thread thread3 = new Thread(thread,"thread - 3");
		thread1.start();
		thread1.join();
		thread2.start();
		thread3.run();
		thread3.start();
		thread3.run();
	}
}
