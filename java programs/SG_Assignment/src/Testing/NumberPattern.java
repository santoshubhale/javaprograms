package Testing;

public class NumberPattern {
	// WAP to display below pattern using for loop, while loop, do-while loop
	// 1,3,5,7,9.
	public static void main(String[] args) {
		// for loop
		/*
		 * for(int i =1; i<=10; i++) { if((i%2)==1) {
		 * System.out.println("value of i is :-"+ i); } }
		 */

		// while loop

		/*
		 * int i =1; while(i<=10) { if((i%2)==1) System.out.println("value of i is :-"+
		 * i); i++; }
		 */

		// do while loop
		int i = 1;
		do {
			if((i%2)==1)
			System.out.println("value of i is :-" + i);

			 i++;

		} while (i <= 10);

	}
}