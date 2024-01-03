package com.java.src;

public class GarbageCollection {
public void finalize() {System.out.println("object is garbage collected");}
	public static void main(String[] args) {
		GarbageCollection gc = new GarbageCollection();
		GarbageCollection gc1=new GarbageCollection();
		gc=null;
		gc1=null;
		System.gc();
		

	}

}
