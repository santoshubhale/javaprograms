package Testing;

public class ArrayDulpicateValue {

	public static void main(String[] args) {
		//Q6: Find the duplicate values in a array?
		
		int arr []= {1,2,3,2,3,4,66,55,77,22,77,5,8,7,9,778,22,22};
		
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate : ="+arr[i]);
					break;
				}
			}
		}

	}

}
