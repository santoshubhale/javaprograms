package javascanner;

import java.util.Scanner;

public class EvenAndOddNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int i= scan.nextInt();
		
		if((i%2)==0) {
			System.out.println("Number "+i+ " is even");
		}else {
			System.out.println("Number "+i+ " is odd");
		}
		
	}

}
