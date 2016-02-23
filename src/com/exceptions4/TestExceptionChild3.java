package com.exceptions4;

// Example in case subclass overridden method declares no exception
public class TestExceptionChild3 extends Parent {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}