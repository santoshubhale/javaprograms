package com.sgtesting.assignmentday9;
//WAP to create a boolean array & the read the  element from boolean array using for loop
public class BooleanArrayDemo {

	public static void main(String[] args) {
//		boolean b[]= {true,false, false, true,false,true};
//		for(int i =0; i<b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		// Another Approch
		
		boolean bln []= new boolean[4];
		bln[0]=true;
		bln[1]=false;
		bln[2]=true;
		bln[3]=true;
		for(int i =0; i<bln.length; i++) {
			System.out.println(bln[i]);
		}

	}

}
