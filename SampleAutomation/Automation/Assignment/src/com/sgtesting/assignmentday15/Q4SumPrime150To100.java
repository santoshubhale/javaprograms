package com.sgtesting.assignmentday15;
class PrimeDemo3{
	void prime() {
		int sum=0;
		for(int num=150; num>=100; num--) {
			int flag=0;
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					flag=flag+1;
					break;
				}
			}
			if(flag==0) {
				sum=sum+num;
			}
		}
		System.out.println("Total sum is :- "+sum);
	}
}

public class Q4SumPrime150To100 {

	public static void main(String[] args) {
		PrimeDemo3 pd = new PrimeDemo3();
		pd.prime();

	}

}
