package com.exceptions3;

// 2) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
public class TestExceptionChild extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}
