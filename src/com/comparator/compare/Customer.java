package com.comparator.compare;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Customer implements Comparable<Customer>{
	private String name;
	private int id;
	private String state;
	public Customer(String name,int id,String state){
		this.name = name;
		this.id = id;
		this.state = state;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public boolean equals(Object object) {
		if(object == this){
			return true;			
		}else if(object instanceof Customer){
			final Customer other = (Customer) object;
			return new EqualsBuilder().append(this.name, other.name).isEquals();
		}
		return false;
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17,19).append(this.name).toHashCode();
	}
	public static List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("lakshman", 1, "A"));
		customers.add(new Customer("Lakshman", 5, "a"));
		customers.add(new Customer("abc", 6, "d"));
		customers.add(new Customer("Aabc", 4, "D"));
		return customers;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", state=" + state
				+ "]\n";
	}
	@Override
	public int compareTo(Customer object) {
		/*if(this.id == object.id){
			return 0;			
		}else if(this.id > object.id){
			return 1;
		}else{
			return -1;
		}*/
		return this.name.compareTo(object.name);
	}
}
