package arrayprogram;

public class EvenNumberReverseOrder {
//Programmatically assign even no 60 to 80 into single-d array read the element from the array reverse order
	public static void main(String[] args) {
		int count =0;
		for(int i=60; i<=80; i++) {
			if((i%2)==0) {
				count++;
			}
		}
		System.out.println("Total count:-"+count);
		
		int arr[]= new int[count];
		int k=0;
		for(int j=60; j<=80; j++) {
			if((j%2)==0) {
				arr[k]=j;
				k++;
			}
		}
		for(int n= arr.length-1; n>=0; n--) {
			System.out.println(arr[n]);
		}
	}

}
