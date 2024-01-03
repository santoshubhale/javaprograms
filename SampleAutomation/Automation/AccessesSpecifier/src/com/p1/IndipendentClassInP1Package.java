package com.p1;

public class IndipendentClassInP1Package {
	Protection p = new Protection();
	public IndipendentClassInP1Package() {
		System.out.println("It's a indipendent class in p1 constructor");
	//	System.out.println("Private_a"+p.Private_a);
		System.out.println("protected_b"+p.protected_b);
		System.out.println("Default_c"+p.Default_c);
		System.out.println("public_d"+p.public_d);
	}
}
