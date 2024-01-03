package com.java.src;

public class ImpBreak {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println("Start");
			System.out.println("each value"+i);
			if(i==5) {
				break;
			}
			System.out.println("End of Statement"+i);
		}
		
		System.out.println("End of main");

	}
	
}
//o/p:-
/*  Start
each value1
End of Statement1
Start
each value2
End of Statement2
Start
each value3
End of Statement3
Start
each value4
End of Statement4
Start
each value5
End of main
*/