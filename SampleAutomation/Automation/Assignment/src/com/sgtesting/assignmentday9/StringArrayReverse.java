package com.sgtesting.assignmentday9;

//WAP to create a String array & the read the element from String array reverse order using while loop
public class StringArrayReverse {

	public static void main(String[] args) {
//		String str[]= {"santosh","ubhale","software","engineer"};
//		int i = str.length-1;
//		while(i>=0) {
//			System.out.println(str[i]);
//			i--;
//		}

		String s[] = new String[4];
		s[0] = "SG";
		s[1] = "Testing";
		s[2] = "Institute";
		s[3] = "Bangalore";
		int i = s.length - 1;
		while (i >= 0) {
			System.out.println(s[i]);
			i--;
		}

	}

}
