package com.sgtesting.assignmentday11;

class Desktop {

	String brand;
	int price;
	String size;
	String RAM;

}

class Laptop {
	String brand;
	int price;
	String size;
	String RAM;

}

class Mobile {
	String brand;
	int price;
	String size;
	String RAM;

}

public class Ques6 {

	public static void main(String[] args) {

		Desktop d = new Desktop();
		d.brand = "HP";
		d.price = 15000;
		d.size = "15 inch";
		d.RAM = "4 GB";
		System.out.println("brand:-" + d.brand);
		System.out.println("price:-" + d.price);
		System.out.println("size:-" + d.size);
		System.out.println("RAM:-" + d.RAM);
		System.out.println("--------------------");
		Laptop l = new Laptop();
		l.brand = "Dell";
		l.price = 55000;
		l.size = "10 inch";
		l.RAM = "16 GB";
		System.out.println("brand:-" + l.brand);
		System.out.println("price:-" + l.price);
		System.out.println("size:-" + l.size);
		System.out.println("RAM:-" + l.RAM);
		
		System.out.println("--------------------");
		Mobile m = new Mobile();
		m.brand = "iphone";
		m.price = 35000;
		m.size = "4 inch";
		m.RAM = "8 GB";
		
		System.out.println("brand:-" + m.brand);
		System.out.println("price:-" + m.price);
		System.out.println("size:-" + m.size);
		System.out.println("RAM:-" + m.RAM);

	}

}
