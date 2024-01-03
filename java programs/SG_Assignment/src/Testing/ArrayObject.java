package Testing;

import java.util.Arrays;

public class ArrayObject {

	public static void main(String[] args) {
		//Q13: Can we store values of different datatypes into array?
		
		Object arr [] = new Object[4];
		
		arr[0]=123;
		arr[1]="santosh";
		arr[2]='a';
		arr[3]=10.45;
		System.out.println(Arrays.toString(arr));

	}

}
