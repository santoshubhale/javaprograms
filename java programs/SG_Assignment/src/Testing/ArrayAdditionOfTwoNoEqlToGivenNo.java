package Testing;

public class ArrayAdditionOfTwoNoEqlToGivenNo {
	//Q14: Write a program to find the addition of 2 
	//elements in a array is equal to the given number?
	public static void main(String[] args) {
		int arr[]= {3,6,7,8,1,2,9};
		int num =15;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if((arr[i])+(arr[j])==num) {
					System.out.println(arr[i]+" + "+arr[j]+" ="+ num);
				}
			}
		}

	}

}
