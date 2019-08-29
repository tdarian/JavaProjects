package com.in28mins.ifstatement.examples;

import java.util.Scanner;

public class dateResultsRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the Day Number: ");
		int dayNumber = scanner.nextInt();
		System.out.println("Input the Month Number: ");
		int monthNumber = scanner.nextInt();

		dateResults inputValue = new dateResults();
		System.out.println(inputValue.isWeekDay(dayNumber));
		System.out.println(inputValue.determineNameOfMonth(monthNumber));
		System.out.println(inputValue.determineNameOfDay(dayNumber));

	}

}
