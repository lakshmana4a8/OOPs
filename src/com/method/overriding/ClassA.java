package com.method.overriding;

public class ClassA {
	public int sum(int a, int b) {
		System.out.println("method1 invoked in Class A");
		return 2;
	}

	public long sum(int a, long b) {
		System.out.println("method2 invoked in Class A");
		return 3;
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.sum(1, 2));
	}
}
