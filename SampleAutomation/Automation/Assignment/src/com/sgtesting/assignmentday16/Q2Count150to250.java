package com.sgtesting.assignmentday16;
class Countnum{
	int democount(int a, int b) {
		
		int count=0;
		for(int i=a; i<=b; i++) {
			if(i%2==1) {
			count++;
			}
		}
		return count;
	}
}

public class Q2Count150to250 {

	public static void main(String[] args) {
		Countnum cn = new Countnum();
		int c=cn.democount(150,250);
		System.out.println("Total count is = "+c);
		

	}

}
