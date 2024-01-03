package com.sgtesting.parametrizedconstructor;

class Desktop {

	String brand;
	int price;
	String size;
	String RAM;

	Desktop(String Brand,int Price,String Size,String ram) {
		brand = Brand;
		price = Price;
		size = Size;
		RAM = ram;
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

	Laptop(String Brand,int Price,String Size,String ram) {
		brand = Brand;
		price = Price;
		size = Size;
		RAM = ram;
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

	Mobile(String Brand,int Price,String Size,String ram) {
		brand = Brand;
		price = Price;
		size = Size;
		RAM = ram;

		System.out.println("brand:-" + brand);
		System.out.println("price:-" + price);
		System.out.println("size:-" + size);
		System.out.println("RAM:-" + RAM);
	}
}

public class Ques6inParametrizedConstructor {

	public static void main(String[] args) {
		Desktop d = new Desktop("HP",15000,"15 inch","4 GB");

		Laptop l = new Laptop("Dell", 2000000, "10 inch", "16 GB");

		Mobile m = new Mobile("Vivo", 10000, "6 inch", "8 GB");

	}

}
