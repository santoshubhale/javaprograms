package com.java.src;

public class ExceptionPropogation {
	void m() {
		int a = 711 / 0;
	}

	void n() {
		m();
	}

	void p() {
		 try {
		n();
		 }catch (Exception e) {
			 System.out.println(e);
			 e.printStackTrace();
		 }
	}

	public static void main(String[] args) {

		ExceptionPropogation ep = new ExceptionPropogation();
		ep.p();

		System.out.println("Normal flow");
	}

}
