package com.sgtesting.assignmentday35filehandling;

import java.io.File;

class RecusionDemo{
	int count=0;
	void sample() {
		File f = new File("C:\\Users\\Bablu\\Desktop\\Test1Demo");
		File [] f1=f.listFiles();
		 {
			 if(count<=10)
			if(f1[i].isFile()==true) {
				System.out.println(f1[i].getPath());
			}
		}
		sample();
	}
}

public class Q5 {

	public static void main(String[] args) {
		RecusionDemo rd = new RecusionDemo();
		rd.sample();

	}

}
