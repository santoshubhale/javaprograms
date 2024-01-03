package com.sgtesting.src;

public class ArrayOneD_1_2 {

	public static void main(String[] args) {
		String a []= new String[5];
		a[0]="hi";
		a[1]="hello";
		a[2]="good";
		a[3]="morning";
		a[4]="Bangalore";
		
		System.out.println("*****for loop*****");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*******for each loop****");
		for(String x : a) {
			System.out.println(x);
		}
		System.out.println("*********while loop*********");
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		System.out.println("********do while loop********");
		 i =0;
		 do {
			 System.out.println(a[i]);
			 i++;
		 }while(i<a.length);
	}

}
