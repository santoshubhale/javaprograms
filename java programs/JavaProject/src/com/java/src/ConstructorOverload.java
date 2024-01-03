package com.java.src;

public class ConstructorOverload {
	int id;
	long num;
	String name;
	
	ConstructorOverload(int i, long n){
		this.id=i;
		this.num=n;
		
	}
	ConstructorOverload(int i, long n,String name){
		this.id=i;
		this.name=name;
		this.num=n;
	}
	void display() {
		System.out.println(id+" "+num);
		System.out.println(id+" "+num+""+name);
	}

	public static void main(String[] args) {
		ConstructorOverload pc = new ConstructorOverload(1, 20,"santosh");
		pc.display();

	}

}
