package Testing;

public class NumberPattern2 {
	// WAP to display below pattern using for loop, while loop, do-while loop
	// 9,7,5,3,1

	public static void main(String[] args) {
		// for loop
		/*
		 * for(int i =10; i>=1; i--) 
		 * {
		 *  if((i%2)==1) 
		 *  {
		 * System.out.println("value of i is :-"+ i); 
		 * }
		 *  }
		 */

		// while loop

		
		/*  int i =10;
		  while(i>=1) { 
			  if((i%2)==1)
			  System.out.println("value of i is :-"+ i);
		  i--; 
		  }
		 */

		// do while loop
		int i = 10;
		do {
			if ((i % 2) == 1)
				System.out.println("value of i is :-" + i);
			i--;

		} while (i >= 1);

	}

}
