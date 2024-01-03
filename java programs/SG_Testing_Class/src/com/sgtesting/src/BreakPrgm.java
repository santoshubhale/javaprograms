package com.sgtesting.src;

public class BreakPrgm {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println("Inside the loop :"+i);
			if(i==5) {
				System.out.println("Condition matchs");
				break;
			}
			System.out.println("____________________");
		}

	}

}
