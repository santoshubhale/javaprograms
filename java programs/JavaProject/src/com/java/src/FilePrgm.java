package com.java.src;

import java.io.File;
import java.io.FileWriter;

public class FilePrgm {

	public static void main(String[] args)throws Exception
	{
		File f = new File("C:\\Users\\Bablu\\Desktop\\santosh java\\abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		
		FileWriter fw = new FileWriter("C:\\Users\\Bablu\\Desktop\\santosh java\\abc2.txt");
		fw.write(500);
		fw.write('a');
		
		fw.flush();
		fw.close();
	}

}
