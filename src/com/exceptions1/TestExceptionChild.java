package com.exceptions1;

// Subclass overridden method cannot throw more checked exceptions than that of super class method
public class TestExceptionChild extends Test {
	@Override
	public void display() throws Exception { }

	public static void main(String[] args) throws Exception {
		TestExceptionChild demo = new TestExceptionChild();
		demo.display();
	}
}
