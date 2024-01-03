package javascanner;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age of persion");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println(age+" age persion is eligible for voting");
		}else {
			System.out.println(age+" age persion is not eligible for voting");
		}

	}

}
