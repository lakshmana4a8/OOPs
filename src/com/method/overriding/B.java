package com.method.overriding;

public class B extends A {
	B get() {
		return this;
	}

	public static void main(String[] args) {
		A a = new A();
		a.message();
	}

	public void message() {
		System.out.println("welcome to covariant return type");
	}
}
