package com.java.src;

import java.util.LinkedHashSet;

public class LinkedHashSetPrgm {

	public static void main(String[] args) {
		LinkedHashSet<Integer>lh = new LinkedHashSet<Integer>();
		lh.add(null);
		lh.add(12);
		lh.add(46);
		lh.add(-100);
		lh.add(10000);
		System.out.println(lh);
		System.out.println(lh.size());
	}

}