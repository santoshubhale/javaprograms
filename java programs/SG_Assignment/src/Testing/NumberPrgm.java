package Testing;

public class NumberPrgm {
	// WAP to display below pattern using for loop, while loop, do-while loop
	// 1 1 1 1
	// 2 2 2 2
	// 3 3 3 3
	public static void main(String[] args) {
		//for loop
	/*	for(int i=1; i<=3; i++) {
			for(int j =1; j<=3; j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}*/
		
		// while loop
	/*	int i=1;
		while(i<=3){
		int j =1;
			while(j<=3) {
			System.out.print(" "+i);
			j++;
		}
			System.out.println();
			i++;
		}*/
		//do-while loop
		
		int i=1;
		do {
			int j=1;
			do {
				System.out.print(" "+i);
				j++;
			}while(j<=3);
		System.out.println();
		i++;
		}while(i<=3);
	}

}
