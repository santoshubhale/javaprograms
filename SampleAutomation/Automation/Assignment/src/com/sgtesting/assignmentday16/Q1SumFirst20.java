package com.sgtesting.assignmentday16;

class SumDemo {
	int sum1(int num) {

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			
			sum = sum + i;
		}

		return sum;

	}
}

public class Q1SumFirst20 {

	public static void main(String[] args) {
		SumDemo sd = new SumDemo();
		int s = sd.sum1(20);
		
		System.out.println("sum is = "+s);

	}

}
