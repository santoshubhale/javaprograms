package com.methods;

import java.util.HashMap;
import java.util.Set;

class HashDemo {
	public static Set<Integer> m7() {
		int res = 0;
		HashMap<Integer, String> o1 = new HashMap<Integer, String>();
		o1.put(10, "ravi");
		o1.put(11, "kiran");
		o1.put(14, "reddy");
		o1.put(13, "sai");

		Set<Integer> o = o1.keySet();
	
		return o;
	}

}

public class HashmapkeyOnly {

	public static void main(String[] args) {
		Set<Integer> xx = HashDemo.m7();
		System.out.println(xx);

	}

}
