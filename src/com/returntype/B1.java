package com.returntype;

public class B1 extends A {
	B1 get() {
		return new B1();
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new B1().get().message();
	}
}
