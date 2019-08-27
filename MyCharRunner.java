package com.in28mins.intro;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('t');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsanant());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
