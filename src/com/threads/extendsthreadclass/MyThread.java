package com.threads.extendsthreadclass;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("thread running...... : "+MyThread.currentThread().getName());
		for (int x = 1; x < 4; x++) {
			System.out.println("Runnable running : "+x+" : "+MyThread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
