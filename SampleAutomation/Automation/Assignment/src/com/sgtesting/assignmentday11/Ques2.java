package com.sgtesting.assignmentday11;

class Producrt {
	String productname;
	int productid;
	String producttype;
	String number;

}

class Order {
	String ordertype;
	String location;
	int orderid;
	String oederreachdate;

}

class Items {
	String itemname;
	int itemnumber;
	String itemtype;
	String itemreciveddate;

}

public class Ques2 {

	public static void main(String[] args) {

		Producrt p = new Producrt();
		p.productname = "Vivo";
		p.productid = 220022;
		p.producttype = "Mobile";
		p.number = "1ee12345jj990022";
		System.out.println("productname:-" + p.productname);
		System.out.println("productid:-" + p.productid);
		System.out.println("producttype:-" + p.producttype);
		System.out.println("number:-" + p.number);
		System.out.println("-------------------");

		Order o = new Order();
		o.ordertype = "online";
		o.location = "pune";
		o.oederreachdate = "07/11/2023";
		o.orderid = 124;
		System.out.println("ordertype:-" + o.ordertype);
		System.out.println("location:-" + o.location);
		System.out.println("oederreachdate:-" + o.oederreachdate);
		System.out.println("orderid:-" + o.orderid);
		System.out.println("-----------------------");

		Items i = new Items();
		i.itemname = "Mobile";
		i.itemnumber = 1000;
		i.itemreciveddate = "10/10/2020";
		i.itemtype = "Vivo";
		System.out.println("itemname:-" + i.itemname);
		System.out.println("itemnumber:-" + i.itemnumber);
		System.out.println("itemreciveddate:-" + i.itemreciveddate);
		System.out.println("itemtype:-" + i.itemtype);

	}

}
