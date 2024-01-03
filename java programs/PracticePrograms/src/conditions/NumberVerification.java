package conditions;

public class NumberVerification {

	public static void main(String[] args) {
		int num = -90;

		if (num > 0) {
			System.out.println("Number:- " + num + " is greather than zero");
		} else if (num < 0) {
			System.out.println("Number:- " + num + " is less than zero");
		} else if (num == 0) {
			System.out.println("Number:- " + num + " is equal to zero");
		} else {
			System.out.println("Invalid number");
		}

	}

}
