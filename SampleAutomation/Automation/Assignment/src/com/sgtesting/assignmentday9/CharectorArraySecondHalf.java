package com.sgtesting.assignmentday9;

//WAP to create a charector array & the read the second half of the element from charector array 
public class CharectorArraySecondHalf {

	public static void main(String[] args) {
//		char ch[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
//		for(int i =ch.length/2; i<ch.length; i++) {
//			System.out.println(ch[i]);
//		}

		// Another Approch

		char c[] = new char[4];
		c[0] = 'I';
		c[1] = 'S';
		c[2] = 'R';
		c[3] = 'O';
		
		for(int i =c.length/2; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
