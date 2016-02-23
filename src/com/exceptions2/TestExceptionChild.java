package com.exceptions2;

import java.io.IOException;

//1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
public class TestExceptionChild extends Parent{
	void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}
