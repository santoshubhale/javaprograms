package method;

import java.util.Arrays;

class Missing{
	
	public void missing(int a[]) {
		Arrays.sort(a);
		int x=0;
		int val= a[a.length-1];
		
		for(int i=0; i<val; i++) {
			if(i==a[x]) {
				x++;
			}else {
				System.out.println("Missing number"+i);
			}
		}
		
	}
}

public class MissingNumbers {

	public static void main(String[] args) {
		
		Missing m = new Missing();
		int a[] = {1,2,5,7,9,11,15,16,19};
		m.missing(a);
		
	}

}
