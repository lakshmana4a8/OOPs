package com.comparator.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.builder.CompareToBuilder;

public class SortData {
	public static void main(String[] args) {
		// Using Comparator
		List<Customer> customers = Customer.getCustomers();
		Collections.sort(customers,new Comparator<Customer>() {
			@Override
			public int compare(Customer arg0, Customer arg1) {
				return new CompareToBuilder().append(arg0.getId(), arg1.getId()).toComparison();
			}
		});
		System.out.println(customers);
		// Using Comparable
		Collections.sort(customers);
		System.out.println(customers);
		// Using NameComparaotr
		Collections.sort(customers,new NameComparator());
		System.out.println(customers);
	}
}
