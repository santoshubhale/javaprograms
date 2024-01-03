package com.sgtesting.method;

import java.util.Scanner;

class Factorial {
	void fact1(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(a+" Factorial = "+fact);
	}
}
class Divsible{
	void div() {
		for(int i =100; i>=50; i--) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}

public class MethodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		Factorial f = new Factorial();
		f.fact1(a);
		
	}

}
