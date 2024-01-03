package com.sgtesting.exceptionhandling;

class ExceptionDemo {
	static int show(String str) throws Exception {
		if (str == null) {
			throw new Exception("the input is null , please provide valid string !!!");
		}
		return str.length();
	}
}

public class CombinedException {

	public static void main(String[] args) {
		try {
			int res = ExceptionDemo.show("santosh");
			System.out.println(res);
			int res1 = ExceptionDemo.show(null);
			System.out.println(res1);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
