package Testing;

public class ArrayOneMissingNumber {

	public static void main(String[] args) {
		//Q8: Find the 1 missing values in a array?
		
		int arr[]={1,2,3,4,6};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<arr.length;i++) {
			sum1 = sum1+arr[i] ;
		}
			System.out.println("sum1="+sum1);
		
		
		for(int i=1; i<=arr[arr.length-1];i++) {
			sum2 = sum2+i;
		}
		System.out.println("sum2="+sum2);
		int num = sum2-sum1;
		System.out.println("missing number="+num);
	}
}
