package com.sgtesting.assignmentday15;

class PrimeDemo1 {
		
	void prime() {
		for (int num = 50; num <= 100; num++) {
			int flag = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag++;
					break;
				}

			}
			if(flag==0) {
				System.out.println(num+" :- is prime");
			}
		}
	}
}

public class Q2PrimeNo50To100 {

	public static void main(String[] args) {
		PrimeDemo1 pd = new PrimeDemo1();
		pd.prime();

	}

}
