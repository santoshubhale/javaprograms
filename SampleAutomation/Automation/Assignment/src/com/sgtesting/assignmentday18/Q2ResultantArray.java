package com.sgtesting.assignmentday18;
class ResultantDemo{
	static int [] resultant(int a[], int b[]) {
		int res[]=new int [a.length+b.length];
		int count=0;
		for(int i=0; i<a.length; i++) {
			res[i]=a[i];
			count++;
		}
		for(int j=0; j<b.length; j++) {
			res[count++]=b[j];
		}
		return res;
	}
}
public class Q2ResultantArray {

	public static void main(String[] args) {
		int []x= {1,2,3,45};
		int y[]= {6,7,8,9,11};
		int result[]=ResultantDemo.resultant(x, y);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
