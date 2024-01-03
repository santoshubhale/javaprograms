package com.sgtesting.assignmentday9;

// WAP to create a charector array & the read the element from charector array using while loop
public class CharectorArrayProgram {

	public static void main(String[] args) {
//		char ch[] = { 's', 'a', 'n', 't', 'o', 's', 'h' };
//		int i = 0;
//		while (i <= ch.length - 1) {
//			System.out.println(ch[i]);
//			i++;
//		}

		// Another Approch

		char c[] = new char[4];
		c[0] = 'd';
		c[1] = 'e';
		c[2] = 'l';
		c[3] = 'l';
		int i = 0;
		while (i <= c.length - 1) {
			System.out.println(c[i]);
			i++;
		}

	}

}
