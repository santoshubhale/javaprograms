package Testing;

import java.util.Arrays;

public class ArrayMissingNumber {
	//Q8: Find the missing values in a array?
	public static void main(String[] args) {
		int arr[]= {1,3,4,7,8,9,11,15,18,24,20};
		Arrays.sort(arr);
		int x=0;
		int max = arr[arr.length-1];
		
		for(int i=0; i<max;i++) {
			if(i==arr[x]) {
				x++;
			}else {
				System.out.println("Missing Number is :-"+i);
			}
		}

	}

}
