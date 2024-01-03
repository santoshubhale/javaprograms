package com.sgtesting.assignmentday21;

class AA {
	String name;
	int age;
	AA(String name) {
		this.name=name;
		System.out.println("Name = " + name);
	}

	AA(int age) {
		 this.age=age ;
		System.out.println("Age = " + age);
	}

}

class BB extends AA {
	String name;
	int age;
	BB(String name1,String name){
		super(name1);
		this.name=name;
		System.out.println("Name = "+ name);
	}
    BB(int age1,int age){
    	super(age1);
    	this.age=age;
    	System.out.println("Age = "+ age);
    }
}

class CC extends BB {
	int age;
	String name;
	CC(String name,String name1,String a ){
		super(name, name1);
		this.name=name;
		System.out.println("Name= "+a);
		
	}
	CC(int age1,int age2,int age){
		super(age1,age2);
		this.age=age;
		System.out.println("Age="+age);
		
	}

}

public class Q5MultilevelInheritanceSuperclassConstrotorOverLoading {

	public static void main(String[] args) {
	
		CC d = new CC("Santosh", "Ubhale", "Gulbarga");
		CC d1= new CC(11, 20, 30);
	

	}

}
