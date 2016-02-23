package com.comparator.compare;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class NameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return new CompareToBuilder().append(arg0.getName(), arg1.getName()).toComparison();
	}

}
