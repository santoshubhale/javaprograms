package Testing;

public class TriangleNumberPattren {
	// WAP to display below pattern using for loop, while loop, do-while loop
	//1
	//2 3
	//4 5 6
	public static void main(String[] args) {
		//for loop
	/*	int x=1;
		for(int i=1; i<=3;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}*/
		// while loop
		
	/*	int i =1;
		int x=1;
		while(i<=3) {
			int j = 1;
			while(j<=i) {
				System.out.print(x);
				j++;
				x++;
			}
			System.out.println();
			i++;
		}*/
		
		//do while loop
		int i=1;
		int x=1;
		do {
			int j=1;
			do {
				System.out.print(x);
				j++;
				x++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=3);

	}

}
