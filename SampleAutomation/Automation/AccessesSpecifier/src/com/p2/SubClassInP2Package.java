package com.p2;

import com.p1.Protection;

public class SubClassInP2Package extends Protection {
	public SubClassInP2Package() {
		System.out.println("It's a sub class in p2 package class constructor");
//		System.out.println("Private_a" + Private_a);
		System.out.println("protected_b" + protected_b);
//	 System.out.println("Default_c" + Default_c);
		System.out.println("public_d" + public_d);
	}
}