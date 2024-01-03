package com.sgtesting.parametrizedconstructor;

class Fruits {
	String fruitsname;
	int price;
	String quntity;
	String quality;

	Fruits(String Fruitsname,int Price,String Quntity,String Quality) {
		fruitsname = Fruitsname;
		price = Price;
		quntity = Quntity;
		quality = Quality;
		System.out.println("fruitsname:-" + fruitsname);
		System.out.println("price:-" + price);
		System.out.println("quntity:-" + quntity);
		System.out.println("quality:-" + quality);
		System.out.println("********************");
	}

}

class Flowers {
	String flowername;
	int price;
	String quntity;
	String quality;

	Flowers(String Flowername,int Price,String Quntity,String Quality) {
		flowername = Flowername;
		price = Price;
		quntity = Quntity;
		quality = Quality;
		System.out.println("flowername:-" + flowername);
		System.out.println("price:-" + price);
		System.out.println("quntity:-" + quntity);
		System.out.println("quality:-" + quality);
		System.out.println("********************");
	}

}

class Vegitables {
	String vegitablename;
	int price;
	String quntity;
	String quality;

	Vegitables(String Vegitablename,int Price,String Quntity,String Quality) {
		vegitablename = Vegitablename;
		price = Price;
		quntity = Quntity;
		quality = Quality;
		System.out.println("vegitablename:-" + vegitablename);
		System.out.println("price:-" + price);
		System.out.println("quntity:-" + quntity);
		System.out.println("quality:-" + quality);

	}

}

public class Ques5inParametrizedConstructor {

	public static void main(String[] args) {
		Fruits f = new Fruits("Mango",300,"half kg","Good");

		Flowers fl = new Flowers("Lotus",500,"1/4 kg","better");

		Vegitables v = new Vegitables("Tomato",100,"2 kg","Good");

	}

}
