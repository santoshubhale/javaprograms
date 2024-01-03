package com.filehandling;


import java.io.File;
public class Demo {



	public static void main(String[] args) {
		cretaefile();
		renamefile();
		deletefile();
		fileCollections();

	}

	private static void cretaefile() {
		try {
			File f1 = new File("D:\\Example\\FileDeatils\\sample.txt");
			f1.createNewFile();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void renamefile() {
		try {
			File f1 = new File("D:\\Example\\FileDeatils\\sample.txt");
			File f2 = new File("D:\\Example\\FileDeatils\\sample1.txt");
			boolean v1 = f1.renameTo(f2);
			System.out.println("File is renamed" + v1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deletefile() {
		try {

			File f2 = new File("D:\\Example\\FileDeatils\\sample1.txt");
			boolean v2 = f2.delete();
			System.out.println("File is renamed" + v2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void fileCollections() {
		File f1 = new File("D:\\Example\\FileDeatils");
		File[] f2 = f1.listFiles();
		for (int i = 0; i < f2.length; i++) {
			System.out.println(f2[i].getPath());
			if (f2[i].isFile() == true)// display on files
			{
				if (f2[i].getName().endsWith(".xlsx")) {
					System.out.println(f2[i].getPath());
				}
			}
		}
	}
}


