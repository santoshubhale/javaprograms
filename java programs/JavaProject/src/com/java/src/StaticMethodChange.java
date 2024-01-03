package com.java.src;

public class StaticMethodChange {
	
	int id;
	int num;
	static int mobile = 9898790;
	
	StaticMethodChange(int i, int n){
		this.id=i;
		this.num=n;
	}
	static void change(){
		mobile=76769777;
		
	}
	void display() {
		System.out.println(id+" "+num+" "+mobile);
	}

	public static void main(String[] args) {
		StaticMethodChange.change();
		StaticMethodChange smc =new StaticMethodChange(1, 1234);
		StaticMethodChange smc1 =new StaticMethodChange(2,3452);
		smc.display();
		smc1.display();
		
	}

}
