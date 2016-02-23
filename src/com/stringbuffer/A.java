package com.stringbuffer;

public class A {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 8, "Java");
		System.out.println(sb);// prints HJavalo
	}
}