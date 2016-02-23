package com.exceptions4;

import java.io.IOException;

// Example in case subclass overridden method declares same exception
public class TestExceptionChild1 extends Parent {
	void msg() throws IOException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild1();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}