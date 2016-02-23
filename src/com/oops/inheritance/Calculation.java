package com.oops.inheritance;

public class Calculation {
	public int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public void Substraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}
}