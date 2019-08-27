package com.in28mins.intro;

public class MyChar {
	
	private char myCharacter;
	
	public MyChar(char myCharacter)
	{
		this.myCharacter = myCharacter;
	}
	
	public boolean isVowel() {
		boolean check = false;
		if (  myCharacter == 'a' || myCharacter == 'e'
		    || myCharacter == 'i'|| myCharacter == 'o'
		    || myCharacter == 'u' || myCharacter == 'A' 
		    || myCharacter == 'E' || myCharacter == 'I'
		    || myCharacter == 'O' || myCharacter == 'U') {
			check = true;
		}
			return check;
		
	}
	//using the unicode List AScii
	public boolean isAlphabet() {
		boolean check1 = false;
		if ((myCharacter >= 65 && myCharacter <=90) || (myCharacter >= 97 && myCharacter <= 122)) {
			check1 = true;
		}	
		return check1;
	}
	
	public boolean isNumber() {
		boolean check2 = false;
		if (myCharacter >= 48 && myCharacter <= 57 ) {
			check2 = true;
		}	
		return check2;
	}
	public boolean isConsanant() {
		if(isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
		
	}
	
	public static void printUpperCaseAlphabets() {
		for (char i = 65; i <= 90; i++) {
			System.out.println(i);
		}
	}
	public static void printLowerCaseAlphabets() {
		for (char i = 97; i <= 122; i++) {
			System.out.println(i);
		}
	}

}
