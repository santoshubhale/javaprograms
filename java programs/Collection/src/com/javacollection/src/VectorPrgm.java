package com.javacollection.src;
import java.util.Iterator;
import java.util.Vector;
public class VectorPrgm {

	public static void main(String[] args) {
		Vector <String> v = new Vector<String>();
		v.add("Santosh");
		v.add("Ubhale");
		System.out.println(v);
		Iterator<String> i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
