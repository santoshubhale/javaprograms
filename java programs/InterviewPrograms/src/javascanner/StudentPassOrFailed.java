package javascanner;

import java.util.Scanner;

public class StudentPassOrFailed {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marksScord, passingMarks;
		passingMarks = 35;
		System.out.println("Enter a scored by student");
		marksScord = scan.nextInt();
		if (marksScord >= passingMarks) {
			System.out.println("Student has pass the exam");
		} else {
			System.out.println("Student has failed the exam");
		}

	}

}
