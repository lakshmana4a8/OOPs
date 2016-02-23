package com.exceptions.examples;

public class WithoutCatchBlock {
	public static void main(String args[]) {
		try {
			System.out.println(10 / 0);
			System.out.println("Hello 1");
		} finally {
			System.out.println();
			System.out.println("From finally block");
		}
		System.out.println("Hello 2");
	}
}
