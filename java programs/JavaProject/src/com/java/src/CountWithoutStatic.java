package com.java.src;

public class CountWithoutStatic {
int count = 0;
CountWithoutStatic(){
	count++;
	System.out.println(count);
}
	public static void main(String[] args) {
		CountWithoutStatic cws = new CountWithoutStatic();
		CountWithoutStatic cws1 = new CountWithoutStatic();
		CountWithoutStatic cws2 = new CountWithoutStatic();

	}

}
