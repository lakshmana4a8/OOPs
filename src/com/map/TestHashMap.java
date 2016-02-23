package com.map;

import java.util.HashMap;
import java.util.Map;

import com.set.User;

public class TestHashMap {
	public static void main(String args[]) {

		HashMap<User, User> al = new HashMap<User, User>();
		
		al.put(new User(1, "L"),new User(1, "L"));
		al.put(new User(5, "L"),new User(1, "L"));
		al.put(new User(2, "M"),new User(2, "M"));
		al.put(new User(1, "K"),new User(1, "K"));
		al.put(new User(2, "N"),new User(2, "N"));

		for (Map.Entry<User, User> m : al.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
