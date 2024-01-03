package ConstructorAssignment;

import java.util.Scanner;

//WAM to find that the person is eligible for marriage based on the age & gender

class Demo {
	public void marrege(String gender, int age) {

		if (gender.equals("male") && age >= 21) {
			System.out.println(gender + " is eligible for marriage");
		} else if (gender.equals("female") && age >= 18) {
			System.out.println(gender + " is eligible for marriage");
		} else {
			System.out.println(gender + " not eligible for marriage");
		}
	}
}

public class MethodMarrageAge {
	public static void main(String[] args) {
		Demo d = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a gender");
		String gender = sc.next();
		System.out.println("Enter a age");
		int age = sc.nextInt();
		d.marrege(gender, age);

	}

}
