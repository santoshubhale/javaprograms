package com.sgtesting.assignmentday35filehandling;

import java.io.File;

public class Q4 {

	public static void main(String[] args) {
		Q4.display();
	}

	static void display() {
		File f = new File("C:\\Users\\Bablu\\Desktop\\Test\\Screenshot (2).png");
//		File[] ff = f.listFiles();
//		for(int i=0; i<ff.length; i++) {
//			if(ff[i].isFile()==true) {
//			System.out.println(ff[i].getPath());
//			if (ff[i].getName().endsWith(".xlsx")) {
//				System.out.println(ff[i].getPath());
//			}
//			if (ff[i].getName().endsWith(".txt")) {
//				System.out.println(ff[i].getPath());
//			}
//			if (ff[i].getName().endsWith(".png")) {
//				System.out.println(ff[i].getPath());
//			}
//			File f2 = new File("C:\\Users\\Bablu\\Desktop\\Test\\abcxyz.txt");
//			boolean b = f.renameTo(f2);
//		System.out.println(b);
		boolean bb = f.delete();
		System.out.println(bb);
	}
}
