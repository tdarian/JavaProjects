package com.in28mins.loops;

public class MyNumber {
	private int number;
	
	public MyNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		for(int i = 2; i < number; i++) {
			if (number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int sumUptoN() {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int sumOfDivisors() {
		int sum2 = 0;
		for(int i = 1; i <= number; i++) {
			if (number%i == 0){
				if(i != 1 && i != number) {
					sum2 += i;
				}
			}
		}
		return sum2;
	}
	
	public void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
