package Testing;

public class StarPattren1 {
	// WAP to display below pattern using for loop, while loop, do-while loop
	// *
	// **
	// ***
	public static void main(String[] args) {
		//for loop
	/*	for(int i=1; i<=3;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		//while loop
	/*	int i =1;
		while(i<=3) {
			int j = 1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		//do while loop
		int i=1;
		do {
			int j=1;
			do {
				System.out.print(" *");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=3);
		
	}

}
