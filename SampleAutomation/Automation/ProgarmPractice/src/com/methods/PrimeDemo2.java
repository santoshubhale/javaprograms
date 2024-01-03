package com.methods;
class Prime{
	boolean isPrime(int num) {
		int flag=0;
		boolean result=false;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag+=1;
				break;
			}
		}
		if(flag==1) {
			result= true;
		}
		return result;
	}
}

public class PrimeDemo2 {

	public static void main(String[] args) {
		Prime p = new Prime();
		boolean b=p.isPrime(7);
		System.out.println(b);
		
		
		// Display prime 1 to 50
		for(int i=0; i<=50; i++) {
			if(p.isPrime(i)==false) {
				System.out.println("prime number:-"+i);
			}
		}
		// find count of prime number in between 50 to 100
		int count=0;
		for(int i=50; i<=100; i++) {
			if(p.isPrime(i)==false) {
				count+=1;
			}
		}
		System.out.println("Total count ="+count);
		
		// Display sum of prime number in between 150 to 100
		int sum=0;
		for(int i=150; i>=100; i--) {
			if(p.isPrime(i)==true) {
				sum=sum+i;
			}
		}
		System.out.println("Sum is = "+sum);
		
		
	}

}
