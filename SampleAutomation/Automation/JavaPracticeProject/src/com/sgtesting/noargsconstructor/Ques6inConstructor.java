package com.sgtesting.noargsconstructor;

class Desktop {

	String brand;
	int price;
	String size;
	String RAM;

	Desktop() {
		brand = "HP";
		price = 15000;
		size = "15 inch";
		RAM = "4 GB";
		System.out.println("brand:-" + brand);
		System.out.println("price:-" + price);
		System.out.println("size:-" + size);
		System.out.println("RAM:-" + RAM);
		System.out.println("--------------------");

	}
}

class Laptop {
	String brand;
	int price;
	String size;
	String RAM;

	Laptop() {
		brand = "Dell";
		price = 55000;
		size = "10 inch";
		RAM = "16 GB";
		System.out.println("brand:-" + brand);
		System.out.println("price:-" + price);
		System.out.println("size:-" + size);
		System.out.println("RAM:-" + RAM);

		System.out.println("--------------------");

	}
}

class Mobile {
	String brand;
	int price;
	String size;
	String RAM;

	Mobile() {
		brand = "iphone";
		price = 35000;
		size = "4 inch";
		RAM = "8 GB";

		System.out.println("brand:-" + brand);
		System.out.println("price:-" + price);
		System.out.println("size:-" + size);
		System.out.println("RAM:-" + RAM);
	}
}

public class Ques6inConstructor {

	public static void main(String[] args) {

		Desktop d = new Desktop();

		Laptop l = new Laptop();

		Mobile m = new Mobile();
	}

}
