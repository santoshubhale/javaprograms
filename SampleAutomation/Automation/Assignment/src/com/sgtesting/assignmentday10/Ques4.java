package com.sgtesting.assignmentday10;

public class Ques4 {

	public static void main(String[] args) {
		String s[][]= {{"one","two","three"},{"four","five","six"},{"seven","eight","nine"}};
		String s1 = " ";
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				 s1= s1+s[i][j];
			}
		}
		System.out.print(s1);

	}

}
