package method;
//WAM to reverse array?

class ReverseProgram {

	public void reverse(int arr[]) {
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}

public class ReverseMethodProgram {

	public static void main(String[] args) {
		
		ReverseProgram rp = new ReverseProgram();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		rp.reverse(arr);
		
	}

}
