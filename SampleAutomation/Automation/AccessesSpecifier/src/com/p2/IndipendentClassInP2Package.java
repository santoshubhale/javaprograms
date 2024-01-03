package com.p2;

import com.p1.Protection;

public class IndipendentClassInP2Package {
	Protection p = new Protection();
	public IndipendentClassInP2Package() {
		System.out.println("It's a indipendent class in p2 package class constructor");
//		System.out.println("Private_a"+p.Private_a);
//		System.out.println("protected_b"+p.protected_b);
//		System.out.println("Default_c"+p.Default_c);
		System.out.println("public_d"+p.public_d);
	}
}
