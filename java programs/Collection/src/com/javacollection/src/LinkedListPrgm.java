package com.javacollection.src;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListPrgm {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Santosh");
		ll.add("IS");
		ll.add("Java");
		ll.add("Developer");
		System.out.println(ll);
		Iterator it = ll.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
