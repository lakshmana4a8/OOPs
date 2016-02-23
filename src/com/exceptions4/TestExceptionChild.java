package com.exceptions4;

// 1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

// Example in case subclass overridden method declares parent exception
public class TestExceptionChild extends Parent {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
