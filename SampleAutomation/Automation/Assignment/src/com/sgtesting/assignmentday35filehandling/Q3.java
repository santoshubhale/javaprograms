package com.sgtesting.assignmentday35filehandling;
import java.io.File;

class Sample {

	static void show() {
		File year = new File("C:\\Users\\Bablu\\Desktop\\years");
		String[] s = {"january","february","march","april","may","june","july","august","september","octomber","november","december"};
		for(String st : s) {
			File ff = new File(year,st);
			ff.mkdir();
		}
	}
}


public class Q3 {

	public static void main(String[] args) {
		Sample.show();
		System.out.println("Months got created");

	}

}
