package com.in28mins.loops;

public class WhileNumberPlayer {
	private int number;
	
	public WhileNumberPlayer(int number) {
		this.number = number;
	}
	//for limit = 30, output would be 1,2,4,16,25
	public void printSquresUptoLimit() {
		int i = 1;
		int square = 1;
		while(square < number) {
			System.out.print(square + " ");
			i++;
			square = i*i;
		}
		System.out.println();
	}
	//for limit = 30, output would be 1,8,27
	public void printCubesUptoLimit() {
		int i = 1;
		int cube = 1;
		while(cube < number) {
			System.out.print(cube + " ");
			i++;
			cube = i*i*i;
		}
	}

}
