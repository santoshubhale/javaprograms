package javascanner;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a first number");
		int first=s.nextInt();
		System.out.println("Enter a second number");
		int second=s.nextInt();
		
		if(first>second) {
			System.out.println(first+":-is larger number than:-"+second);
		}else if(first<second){
			System.out.println(second+":-is larger number than:-"+first);
		}else {
			System.out.println("Both are same");
		}

	}

}