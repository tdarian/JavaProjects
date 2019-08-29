package com.in28mins.loops;

import java.util.Scanner;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your number: ");
		int number = scanner.nextInt();
		WhileNumberPlayer player = new WhileNumberPlayer(number);
		player.printSquresUptoLimit();
		player.printCubesUptoLimit();

	}

}
