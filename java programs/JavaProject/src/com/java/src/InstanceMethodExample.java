package com.java.src;

public class InstanceMethodExample {

	public static void main(String[] args) {
		InstanceMethodExample im = new InstanceMethodExample();
		System.out.println("the sum =" + im.add(10, 20));
	}

	int s;

	public int add(int a, int b) {
		s = a + b;
		return s;
	}
}
