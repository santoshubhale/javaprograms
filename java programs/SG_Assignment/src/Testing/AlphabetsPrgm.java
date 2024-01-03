package Testing;

public class AlphabetsPrgm {
	// WAP to display below pattern using for loop, while loop, do-while loop
	//A B C
	//D E F
	//G H I
	public static void main(String[] args) {
		//for loop
	/*	char ch = 'A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((ch + " "));
				ch++;
			}
			System.out.println();

		}*/
		
		// while loop
	/*	int i=0;
		char ch ='A';
		while(i<3) {
			int j=0;
			while(j<3) {
				System.out.print(ch+" ");
				j++;
				ch++;
			}
			System.out.println();
			i++;
		}*/
		
		//do while loop
		int i=0;
		char ch='A';
		do {
			int j=0;
			do {
				System.out.print(ch+" ");
				j++;
				ch++;
			}while(j<3);
			System.out.println();
			i++;
		}while(i<3);

	}
}