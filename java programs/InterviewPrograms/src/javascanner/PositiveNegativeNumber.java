package javascanner;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		if(num>0) {
			System.out.println(num+" :- is positive number");
		}else {
			System.out.println(num+" :- is nagative number");
		}

	}

}
