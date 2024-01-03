package Testing;

public class StarPattern3 {
	// WAP to display below pattern using for loop, while loop, do-while loop
	// *
	// **
	// ***
	// ****
	public static void main(String[] args) {
		// for loop
			int x =1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 4 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(x +" ");
				x++;
			}

			System.out.println();
		}

		// while loop
		/*
		 * int i=0; while(i<=3) { int j=4-i; while(j>1) { System.out.print(" "); j--; }
		 * int j1=0; while(j1<=i) { System.out.print(" *"); j1++; }
		 * System.out.println(); i++; }
		 */

		// do while loop
		/*
		 * int i=0; do { int j =4-i; do { int j1=0; do { System.out.print(" *"); j1++;
		 * }while(j1<=i); System.out.print(""); j--; }while(j>1); System.out.println();
		 * i++; }while(i<=3);
		 */

	}
}
