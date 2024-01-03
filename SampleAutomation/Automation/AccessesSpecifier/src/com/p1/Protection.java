package com.p1;

public class Protection {

	private int Private_a = 100;
	protected int protected_b = 200;
	int Default_c = 300;
	public int public_d = 400;
	
	public Protection(){
		System.out.println("It's a protection class constructor");
		System.out.println("Private_a"+Private_a);
		System.out.println("protected_b"+protected_b);
		System.out.println("Default_c"+Default_c);
		System.out.println("public_d"+public_d);
	}

}

