package Testing;

import java.util.Arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		// Q10: Addition of 2 arrays?
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 11, 12, 13, 14, 15, 16 };
		int sum[]= new int[a.length];
		if (a.length==b.length) {
			for(int i=0; i<a.length; i++) {
				sum[i]=a[i]+b[i];
			}
			System.out.println(Arrays.toString(sum));
			
		}else {
			System.out.println("size of the array is matching please check it");
		}
	}

}
