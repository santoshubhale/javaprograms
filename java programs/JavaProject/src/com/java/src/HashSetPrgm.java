package com.java.src;

import java.util.HashSet;

public class HashSetPrgm {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(null);
		hs.add(100);
		hs.add(-100);
		hs.add(100);
		hs.add(500);
		hs.add(10000);
		hs.add(null);
		hs.add(777);
		// hs.remove(100);
		// System.out.println(hs.contains(100));
		System.out.println("First Approch");
		System.out.println(hs);
		System.out.println("Second Approch");
		for (Integer i : hs) {
			System.out.println(i);
		}
	}

}
