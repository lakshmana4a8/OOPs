package com.oops.inheritance;

public class My_Calculation extends Calculation {

	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public static void main(String args[]) {
		int a = 20, b = 10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		System.out.println(demo.z);
		demo.Substraction(a, b);
		System.out.println(demo.z);
		demo.multiplication(a, b);
		System.out.println(demo.z);
	}
}
