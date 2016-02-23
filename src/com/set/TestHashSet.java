package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashSet {
	public static void main(String args[]) {

		HashSet<User> al = new HashSet<User>();
		al.add(new User(1, "L"));
		al.add(new User(2, "M"));
		al.add(new User(1, "K"));
		al.add(new User(2, "N"));

		Iterator<User> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
		TreeSet<User> tl=new TreeSet<User>();
		tl.add(new User(1, "L"));
		tl.add(new User(2, "M"));
		tl.add(new User(1, "K"));
		tl.add(new User(2, "N"));
		
		itr = tl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
}
