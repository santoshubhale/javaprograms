package method;

import java.util.Arrays;
//WAM to sort the number
class SortTheArray{
	
	public void sort(int a[]) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}

public class SortArray {
		
	public static void main(String[] args) {
		SortTheArray sta = new SortTheArray();
		int a[]= {1,4,5,7,3,5,2,8,9,55,4,3,77,22,77,53,78};
		sta.sort(a);

	}

}
