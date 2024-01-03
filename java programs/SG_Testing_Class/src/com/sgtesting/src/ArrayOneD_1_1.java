package com.sgtesting.src;

public class ArrayOneD_1_1 {

	public static void main(String[] args) {
		String [] str = {"Santosh","ubhale","Welcome","to","Bangalore"};
		System.out.println("********for loop********");
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]+" ");
		}
		System.out.println("*********for each loop*********");
		for(String a : str) {
			System.out.println(a);
		}
		System.out.println("*******while loop************");
		int i=0;
		while(i<str.length) {
			System.out.println(str[i]);
			i++;
		}
		System.out.println("*********do while loop******");
		i=0;
		do {
			System.out.println(str[i]);
			i++;
		}while(i<str.length);
	}

}
