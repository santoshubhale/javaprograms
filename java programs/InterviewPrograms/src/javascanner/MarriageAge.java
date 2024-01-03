package javascanner;

import java.util.Scanner;

public class MarriageAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Gender");
		String gender = sc.nextLine();
		System.out.println("Enter a Age");
		int age = sc.nextInt();

		if (gender.equals("male") && age > 21) {
			System.out.println(gender + ":- Eligible for marriage");
		} else if (gender.equals("female") && age > 18) {
			System.out.println(gender + ":- Eligible for marriage");

		} else {
			System.out.println(gender + ":- Not eligible for marriage");
		}

	}
}
