package com.Logical.src;

public class FibonaccaiSeries {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int number3;
		 System.out.print(number1+" "+number2);
		 
		 for(int i = 1; i<=10; ++i) {
			 number3 = number1+number2;
			 System.out.print(" "+number3);
			 number1=number2;
			 number2=number3;
		 }
		 
		 

	}

}
