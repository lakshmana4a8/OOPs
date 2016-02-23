package com.comparator.compare;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class StateComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return new CompareToBuilder().append(arg0.getState(), arg1.getState()).toComparison();
	}

}
