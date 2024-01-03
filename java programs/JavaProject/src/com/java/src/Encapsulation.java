package com.java.src;

public class Encapsulation {
	
	private long money = 100000000l;
	
	public long getMoney() {
		return money;
	}
	public void setMoney(long m) {
		this.money = m;
	}

	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
	//	long a = e.money;
		long m =e.getMoney();
		System.out.println(m);
	//	System.out.println(m);
	}

}
