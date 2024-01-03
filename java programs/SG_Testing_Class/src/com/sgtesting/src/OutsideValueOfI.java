package com.sgtesting.src;

public class OutsideValueOfI {

	public static void main(String[] args) {
		int i;// if you declare int in inside for loop than its throws compilation error.
		for(i=1; i<=10;i++) {
			System.out.println("inside value is:-"+i);
		}
		System.out.println("outside value of i is :-"+i);
	}

}
