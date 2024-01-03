package com.sgtesting.parametrizedconstructor;

class Product {
	String productname;
	int productid;
	String producttype;
	String number;

	Product(String Productname,int Productid,String Producttype,String Number) {
		productname = Productname;
		productid = Productid;
		producttype = Producttype;
		number = Number;
		System.out.println("productname:-" + productname);
		System.out.println("productid:-" + productid);
		System.out.println("producttype:-" + producttype);
		System.out.println("number:-" + number);
		System.out.println("-------------------");
	}
}

class Order {
	String ordertype;
	String location;
	int orderid;
	String orderreachdate;

	Order(String Ordertype,String Location,int Orderid,String Orderreachdate) {
		ordertype = Ordertype;
		location = Location;
		orderreachdate = Orderreachdate;
		orderid = Orderid;
		System.out.println("ordertype:-" + ordertype);
		System.out.println("location:-" + location);
		System.out.println("orderreachdate:-" + orderreachdate);
		System.out.println("orderid:-" + orderid);
		System.out.println("-----------------------");
	}

}

class Items {
	String itemname;
	int itemnumber;
	String itemtype;
	String itemreciveddate;

	Items(String Itemname,int Itemnumber,String Itemtype,String Itemreciveddate) {
		itemname = Itemname;
		itemnumber = Itemnumber;
		itemreciveddate = Itemreciveddate;
		itemtype = Itemtype;
		System.out.println("itemname:-" + itemname);
		System.out.println("itemnumber:-" + itemnumber);
		System.out.println("itemreciveddate:-" + itemreciveddate);
		System.out.println("itemtype:-" + itemtype);
	}

}




public class Ques2inParametrizedConstructor {

public static void main(String[] args) {
	


Product p = new Product("vivo", 100, "mobile", "1ee11jj8899");
Order o = new Order("online", "pune", 20, "04/07/2023");
Items i = new Items("mobile", 1080, "Electonics", "10/11/2023");
}
}