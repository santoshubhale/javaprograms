package com.methods;

class Maths1 {
	boolean isPrime(int num) {
		int flag=0;
		boolean result = false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag=flag+1;
				break;
			}
		}
		if(flag==0) {
			result = true;
		}
		return result;
	}
	

}

public class PrimeDemo1 {

	public static void main(String[] args) {
		Maths1 m = new Maths1();
		boolean b=m.isPrime(9);
		System.out.println(b);
	}

}
