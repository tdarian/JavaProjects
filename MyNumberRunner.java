package com.in28mins.loops;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your number: ");
		int numberInput = scanner.nextInt();
		MyNumber number = new MyNumber(numberInput);
		System.out.println(number.isPrime());
		
		
		System.out.println(number.sumUptoN());
		
		System.out.println(number.sumOfDivisors());
		
		number.printNumberTriangle();

	}

}
