package com.sgtesting.src;

public class NestedIfPrgm {

	public static void main(String[] args) {
		String item = "tuberose";
		String category = "Flower";

		if (category.equals("Flower")) {
			System.out.println("flower category`");
			if (item.equals("rose")) {
				System.out.println("Queen of flower");
			} else if (item.equals("tuberose")) {
				System.out.println("King of flower");
			} else {
				System.out.println("invalid" + item + "type");
			}
		} else {
			System.out.println("Invalid category :" + category);
		}
	}

}
