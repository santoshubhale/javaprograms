package com.javacollection.src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequePrgm {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<String>();
		d.add("Santosh");
		d.add("Is");
		d.add("Business");
		d.add("Man");
		System.out.println("Method 1");
		System.out.println(d);
		System.out.println("Method 2");
		for(String s : d) {
			System.out.println(s);
		}
		System.out.println("Method 3 ");
		Iterator i = d.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
