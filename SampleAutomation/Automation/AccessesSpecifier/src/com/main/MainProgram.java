package com.main;

import com.p1.IndipendentClassInP1Package;
import com.p1.Protection;
import com.p1.SubClassInp1Package;
import com.p2.IndipendentClassInP2Package;
import com.p2.SubClassInP2Package;

public class MainProgram {

	public static void main(String[] args) {
		// Execute protection class constructor
		Protection p = new Protection();
		System.out.println("----------------------");
		// Execute sub class in p1 package class constructor
		SubClassInp1Package sc = new SubClassInp1Package();
		System.out.println("-----------------------");
		// Execute sub class in p1 package class constructor
		IndipendentClassInP1Package ic = new IndipendentClassInP1Package();
		System.out.println("--------------------------");
		// Execute sub class in p2 package class constructor
		SubClassInP2Package sc2 = new SubClassInP2Package();
		System.out.println("-------------------");
		IndipendentClassInP2Package ip2 = new IndipendentClassInP2Package();
	}

}
