package com.sgtesting.assignmentday9;

//WAP to create a String array & the read the first half of the element 
public class StringArrayFirstHalf {

	public static void main(String[] args) {
//		String st[] = {"apple", "ball","cat","dell","elephant","fish"};
//		for(int i=0; i<st.length/2; i++) {
//			System.out.println(st[i]);
//		}
		// Another Approch
		String sr[] = new String[4];
		sr[0] = "Santosh";
		sr[1] = "ubhale";
		sr[2] = "From";
		sr[3] = "Gulbarga";
		for (int i = 0; i < sr.length / 2; i++) {
			System.out.println(sr[i]);
		}
	}

}
