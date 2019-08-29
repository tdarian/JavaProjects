package com.in28mins.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		
		//Type obj = new Type(argument); create a new object
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
		
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.print("Choose Operation: ");
		int operation = scanner.nextInt();
		
		Menu finalvalue = new Menu(number1,number2);
		
		if(operation == 1) {
			System.out.println(finalvalue.add());
		}
		else if(operation ==2) {
			System.out.println(finalvalue.subtract());
		}
		else if(operation == 3) {
			System.out.println(finalvalue.divide());
		}
		else {
			System.out.println(finalvalue.multiply());
		}
		
		
		

	}

}
