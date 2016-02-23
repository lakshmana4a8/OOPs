package com.set;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class User implements Comparable<User>{
	private String name;
	private int id;
	public User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
	public boolean equals(Object object) {
		if(object == this){
			return true;			
		}else if(object instanceof User){
			final User user = (User) object;
			return new EqualsBuilder().append(this.id, user.id).isEquals();
		}
		return false;
	}
	public int hashCode() {
		return new HashCodeBuilder(11,17).append(this.id).toHashCode();
	}
	public static List<User> getUsers(){ 
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "L"));
		users.add(new User(2, "L"));
		users.add(new User(3, "L"));
		return users;
	}
	@Override
	public int compareTo(User paramT) {
		return - this.id + paramT.id;
	}
}
