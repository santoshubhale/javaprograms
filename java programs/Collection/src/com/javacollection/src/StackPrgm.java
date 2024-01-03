package com.javacollection.src;
import java.util.Iterator;
import java.util.Stack;
public class StackPrgm {

	public static void main(String[] args) {
		Stack <String> s = new Stack<String>();
		s.push("USA");
		s.push("Santosh");
		s.push("Ubhale");
		s.pop();
		Iterator <String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

