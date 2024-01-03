package com.java.src;

public class CopyConstructor {
	
	int id;
	String name;
	
	CopyConstructor(int i , String n){
		this.id=i;
		this.name=n;
	}
	CopyConstructor(CopyConstructor c){
		id = c.id;
		name = c.name;
	}
	void display() {
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		
		CopyConstructor cc = new CopyConstructor(1, "santosh");
		CopyConstructor cc1 =new CopyConstructor(cc);
		cc.display();
		cc1.display();
		
		

	}

}
