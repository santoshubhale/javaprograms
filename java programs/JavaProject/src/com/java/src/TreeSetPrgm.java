package com.java.src;

import java.util.TreeSet;

public class TreeSetPrgm {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		// ts.add(null);
		ts.add(12);
		ts.add(23);
		ts.add(-12);
		ts.add(0);
		ts.add(1000);
	//	System.out.println(ts);
		for(Integer i : ts) {
			System.out.println(i);
		}
	}

}
