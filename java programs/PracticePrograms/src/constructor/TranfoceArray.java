package constructor;

import java.util.Arrays;

class Demo{
	
	Demo(int arr[][]){
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
}
}
public class TranfoceArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		Demo d = new Demo(arr);
		

	}

}
