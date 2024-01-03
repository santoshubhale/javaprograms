package arrays;

import java.util.Arrays;

public class AdditionOfOneDArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10, };
		int c[] = new int[a.length];
		if (a.length == b.length) {
			
			for(int i=0;i<a.length; i++) {
				c[i]=a[i]+b[i];
			}
			System.out.println(Arrays.toString(c));

		} else {
			System.out.println("Cann't perform array addition ");
		}

	}

}
