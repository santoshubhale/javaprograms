package com.sgtesting.assignmentday16;

class SumDemo1 {
	int Sum2(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 7 == 0) {

				sum = sum + i;
			}
		}
		return sum;
	}
}

public class Q3Sum100to200 {

	public static void main(String[] args) {
		SumDemo1 sd = new SumDemo1();
		int san = sd.Sum2(100, 200);
		System.out.println("Total sum = " + san);

	}

}
