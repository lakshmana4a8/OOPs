package com.equals.equalto.methods;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Test {
	private String name;
	private int id;
	public Test(String name, int id){
		this.name = name;
		this.id = id;
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
	public int hashCode() {
		return new HashCodeBuilder(17, 31).append(name).append(id).toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Test))
			return false;
		if (obj == this)
			return true;
		Test rhs = (Test) obj;
		return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).isEquals();
	}
	public static void main(String[] args) {
		Test test = new Test("lakshman", 11);
		Test test1 = new Test("lakshman", 11);
		Test test2 = test;
		System.out.println(test == test1);
		System.out.println(test == test2);
		System.out.println(test.equals(test1));
		System.out.println(test.equals(test2));
		System.out.println(test1.equals(test));
		System.out.println(test1.equals(test2));
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
	}
}
