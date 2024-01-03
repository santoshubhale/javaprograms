package com.sgtesting.assignmentday16;
class Factorial{
	int factDemo(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}
}
public class Q6Factorial {

	public static void main(String[] args) {
		Factorial ff = new Factorial();
		int result=ff.factDemo(5);
		System.out.println("Factorial is = "+result);

	}

}
