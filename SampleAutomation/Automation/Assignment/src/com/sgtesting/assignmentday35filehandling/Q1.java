package com.sgtesting.assignmentday35filehandling;

import java.io.File;

public class Q1 {

	public static void main(String[] args) {
		Q1.nestedfloder();
	}

	static void nestedfloder() {
		File f = new File("C:\\Users\\Bablu\\Desktop\\Demo\\e1\\e2\\e3\\e4\\e5\\e6\\e7\\e8\\e9\\e10");
		f.mkdirs();
		System.out.println("Floder got created");
	}
}