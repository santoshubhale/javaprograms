package com.java.src;

public class ImpContinue {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Start");
			System.out.println("Each value" + i);
			if (i == 5) {
				continue;
			}
			System.out.println("End of Statement" + i);

		}
		System.out.println("End of Main");

	}
}
//o/p:-
/*Start
 Each value0
End of Statement0
Start
Each value1
End of Statement1
Start
Each value2
End of Statement2
Start
Each value3
End of Statement3
Start
Each value4
End of Statement4
Start
Each value5
Start
Each value6
End of Statement6
Start
Each value7
End of Statement7
Start
Each value8
End of Statement8
Start
Each value9
End of Statement9
Start
Each value10
End of Statement10
End of Main */
