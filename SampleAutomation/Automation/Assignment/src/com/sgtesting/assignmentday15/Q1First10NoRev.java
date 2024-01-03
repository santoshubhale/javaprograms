package com.sgtesting.assignmentday15;
class CubesDemo{
	void cubes(){
		for(int i =10; i>=0; i--) {
			System.out.println(i+"^"+"3"+"="+i*i*i);
		}
	
		
	}
}
public class Q1First10NoRev {

	public static void main(String[] args) {
	CubesDemo cd = new CubesDemo();
	cd.cubes();

	}

}
