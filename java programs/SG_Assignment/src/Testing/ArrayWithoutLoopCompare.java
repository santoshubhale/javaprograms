package Testing;

import java.util.Arrays;

public class ArrayWithoutLoopCompare {
	//Q16. Compare 2 arrays without loops?
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8};
		int arr2[]={1,2,3,4,5,6,7};
		
		if(Arrays.equals(arr, arr2)==true) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
	}

}