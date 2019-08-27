package com.in28mins.intro;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principle;
	BigDecimal interest;
	
	//constructor 
	public SimpleInterestCalculator(String principle, String interest) {
		
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}
	
	public BigDecimal caclculateTotalValue(int noOfYears) {
		
		BigDecimal totalAmount = principle.add(principle.multiply(interest).multiply(new BigDecimal(noOfYears)));
		return totalAmount;
	}

}
