package javascanner;

import java.util.Scanner;

public class LengthAndBreadth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length value");
		double length = scan.nextDouble();
		System.out.println("Enter a breadth value");
		double breadth = scan.nextDouble();
		
		if(length!=breadth) {
			System.out.println("Rectangle");
		}else {
			System.out.println("Square");
		}

		scan.close();
	}

}
