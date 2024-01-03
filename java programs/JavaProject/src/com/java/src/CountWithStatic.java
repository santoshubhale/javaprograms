package com.java.src;

public class CountWithStatic {

	static int count = 0;
	CountWithStatic(){
		count++;
		System.out.println(count);
	}
		public static void main(String[] args) {
			CountWithStatic cws = new CountWithStatic();
			CountWithStatic cws1 = new CountWithStatic();
			CountWithStatic cws2 = new CountWithStatic();

		}

	}

