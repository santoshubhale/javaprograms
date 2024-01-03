package com.sgtesting.src;

public class ContinuePrgm {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			System.out.println("Inside i value"+i);
			
			if(i==5) {
				System.out.println("Condition Matches");
				continue;
			}
			System.out.println("_______________");
		}

	}

}
