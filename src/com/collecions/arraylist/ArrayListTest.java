package com.collecions.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Test> test = new ArrayList<Test>();
		List<Test> test1= new ArrayList<Test>();
		Test testObj = new Test();
		testObj.setName("lakshman");
		test.add(testObj);
		test1.add(testObj);
		System.out.println(test);
		System.out.println(test1);
	}
}
