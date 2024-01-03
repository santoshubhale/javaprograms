package com.methods;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "santosh");
		map.put(2, "pune");
		map.put(3, "software engineer");
		System.out.println("Hash map output");
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
