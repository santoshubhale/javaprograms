package com.sgtesting.src;

public class AlphabetByDoWhilePrgmAlternative {
// WAP to display the alphabets from A to z alternatively.
	public static void main(String[] args) {

		int i = 0;
		do {
			
			System.out.print((char) (i + 65));
			i=i+2; 
		} while (i < 26);
	}

}
