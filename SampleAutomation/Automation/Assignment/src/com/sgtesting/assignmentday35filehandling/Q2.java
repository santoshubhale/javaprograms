package com.sgtesting.assignmentday35filehandling;

import java.io.File;

class Demo {

	static void show() {
		File f = new File("C:\\Users\\Bablu\\Desktop\\weekdays");
		String[] str = {"sunday","monday","tuesday","wednesday","thusday","friday","saturday"};
		for(String k : str) {
			File ff = new File(f,k);
			ff.mkdir();
		}
	}
}

public class Q2 {

	public static void main(String[] args) {
		Demo.show();
		System.out.println("Directory got created");
	}

}
