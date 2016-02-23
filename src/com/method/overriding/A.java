package com.method.overriding;

public class A {
	A get() {
		return this;
	}
	public void message() {
		System.out.println("A executed..");
	}
	public static void main(String args[]) {
		new B().get().message();
		new A().message();
	}
}