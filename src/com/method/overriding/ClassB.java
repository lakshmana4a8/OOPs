package com.method.overriding;

public class ClassB extends ClassA{
	@Override
	public int sum(int a, int b) {
		System.out.println("method1 invoked in Class B");
		return 2;
	}
	@Override
	public long sum(int a, long b) {
		System.out.println("method2 invoked in Class B");
		return 2;
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.sum(1, 2));
		
		ClassA classA = new ClassB();
		System.out.println(classA.sum(1, 2));
		
		ClassA b = (ClassA) new ClassB();
		System.out.println(b.sum(1, 2));
		
		ClassB classB = (ClassB) new ClassA();
		System.out.println(classB.sum(1, 2));
	}
}
