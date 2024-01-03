package com.java.src;

public class InstanceInitilizerPrgm {
	int speed;

	public InstanceInitilizerPrgm() {
		System.out.println("speed="+speed);
	}
	{
		speed = 100;
	}

	public static void main(String[] args) {
		
		InstanceInitilizerPrgm ii = new InstanceInitilizerPrgm();
		InstanceInitilizerPrgm ii1 = new InstanceInitilizerPrgm();

		

	}

}
/*o/p:-speed=100
speed=100*/