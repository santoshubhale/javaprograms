package com.sgtesting.assignmentday30;

public class Q7 {

	public static void main(String[] args) {
		String str1 = "Bangalore and Mysore";     

		System.out.println("Original String is :" + str1);

		String str[]=str1.split(" ");

		System.out.print("After Change :");

		for(int i=str.length-1;i>=0;i--)

		{

			System.out.print(str[i]+" ");

		}

		System.out.println();

	}

}
