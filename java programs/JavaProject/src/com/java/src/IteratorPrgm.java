package com.java.src;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorPrgm {
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
		
		Iterator<Integer>it = hs. iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
