package com.sgtesting.assignmentday13;

class College {

	College(String name){
		System.out.println("Name :-"+name);
		System.out.println("------------------");
	}
	College(String address, int mobileno) {
		System.out.println("Address:-"+address);
		System.out.println("PhoneNo:-"+mobileno);
		System.out.println("------------------");
	}
	College(double fees, String code){
		System.out.println("Fees :-"+fees);
		System.out.println("Code :-"+code);
	}
}

public class CollegeParameterizedConstructor {

	public static void main(String[] args) {
		College c = new College("SG Testing");
		College c1 = new College("Bangalore", 67657897);
		College c2 = new College(35000.00, "1sg23cs100");
	}

}
