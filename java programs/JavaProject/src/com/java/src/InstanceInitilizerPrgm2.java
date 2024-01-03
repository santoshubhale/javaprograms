package com.java.src;

public class InstanceInitilizerPrgm2 {
	int speed;
	public InstanceInitilizerPrgm2() {
		System.out.println("I am First");
	}
	{
		System.out.println("I am Second");
	}

	public static void main(String[] args) {
		InstanceInitilizerPrgm2 ii = new InstanceInitilizerPrgm2();
		InstanceInitilizerPrgm2 ii2 = new InstanceInitilizerPrgm2();

	}

}
//o/p:-I am Second
/*I am First
I am Second
I am First*/