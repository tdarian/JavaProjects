package com.in28mins.intro;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.caclculateTotalValue(5);
		System.out.println(totalValue);
		
		

	}

}
