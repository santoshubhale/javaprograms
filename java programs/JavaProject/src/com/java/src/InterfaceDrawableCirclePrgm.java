package com.java.src;

public class InterfaceDrawableCirclePrgm implements InterfaceDrawablePrgm {
	@Override
	public void draw() {
		System.out.println("I am Circle");
	}

	public static void main(String[] args) {

		InterfaceDrawablePrgm idp = new InterfaceDrawableCirclePrgm();
		InterfaceDrawablePrgm idp1 = new InterfaceDrawableRectanglePrgm();

		idp.draw();
		idp1.draw();

	}

}
