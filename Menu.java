package com.in28mins.ifstatement.examples;

public class Menu {
	
	private int number1;
	private int number2;
	private int operation;
	
	public Menu(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		
	}
	
	public int add() {
		return number1 + number2;
	}
	
	public int subtract() {
		return number1 - number2;
	}
	
	public int divide() {
		return number1/number2;
	}
	
	public int multiply() {
		return number1*number2;
	}
	
	public void performOperationSwitch(int operation) {
		this.operation = operation;
		switch(operation) {
		case 1 : System.out.println(add());break;
		case 2 : System.out.println(subtract());break;
		case 3 : System.out.println(divide());break;
		case 4 : System.out.println(multiply());break;
		default: System.out.println("Invalid operation");break;
		}

	}
	

}
