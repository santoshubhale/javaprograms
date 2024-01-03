package com.javacollection.src;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePrgm {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Santosh");
		pq.add("ubhale");
		pq.add("Gulbarga");
		pq.add("Bangalore");
		// pq.add(null); doesn't allow the null values
		// System.out.println(pq);
		System.out.println("head = "+pq.element());
		System.out.println("head = " +pq.peek());
		Iterator<String> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("After Remove");
		pq.remove();
		pq.poll();
		Iterator <String>it2 = pq.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}