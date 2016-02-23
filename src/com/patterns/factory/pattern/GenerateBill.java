package com.patterns.factory.pattern;

import java.io.IOException;

public class GenerateBill {
	public static void main(String args[]) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		Plan p = planFactory.getPlan("DOMESTICPLAN");
		System.out.print("Bill amount for DOMESTICPLAN of  " + 100 + " units is: ");
		p.getRate();
		p.calculateBill(100);
		p = planFactory.getPlan("COMMERCIALPLAN");
		System.out.print("Bill amount for COMMERCIALPLAN of  " + 100 + " units is: ");
		p.getRate();
		p.calculateBill(100);
		p = planFactory.getPlan("INSTITUTIONALPLAN");
		System.out.print("Bill amount for INSTITUTIONALPLAN of  " + 100 + " units is: ");
		p.getRate();
		p.calculateBill(100);
	}
}