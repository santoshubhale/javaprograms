package com.sgtesting.assignmentday18;
class SubstractDemo{
	static int [] sub(int a[], int b[] ) {
		int res[]=new int[a.length];
		for(int i=0; i<a.length; i++) {
			 res[i]=a[i]-b[i];
		}
		return res;
	}
	
}
public class Q3Substract1D2ndHalf {

	public static void main(String[] args) {
		int x[]= {10,9,8,7,6,5};
		int y[]= {1,2,3,4,5,1};
		int result[]=SubstractDemo.sub(x, y);
		for(int i=result.length/2; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
