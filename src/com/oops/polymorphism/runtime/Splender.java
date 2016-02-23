package com.oops.polymorphism.runtime;


public class Splender extends Bike {
	int speedlimit = 60;

	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike bikesplender = new Splender();// upcasting
		bikesplender.run();
		System.out.println(bikesplender.speedlimit);
		Bike bike = new Bike();
		bike.run();
		System.out.println(bike.speedlimit);
		Splender splender = new Splender();
		splender.run();
		System.out.println(splender.speedlimit);
	}
}