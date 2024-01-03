package com.prcticeprogram.src;

public class ProgrameticallyDiv7Rev {

	public static void main(String[] args) {
		int x=0;
		int a[]= new int[10];
		for(int i =70; i>=1; i--) {
			if(i%7==0) {
				a[x]=i;
				x++;
			}
		}
		for(int j=a.length-1; j>=0; j--) {
			System.out.println(a[j]);
		}
	}

}
