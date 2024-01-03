package oopsconcept;

public class ConstructorDemo {
	ConstructorDemo(){
		for(int i=0; i<=10; i++) {
			System.out.print(i);
			
		}
	}
	
	ConstructorDemo(int x){
		
		for(int i= 10; i>=1; i--) {
			System.out.print(i);
		}
		
	}
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		System.out.println("");
		System.out.println("_______________________");
		ConstructorDemo cd1 = new ConstructorDemo(1);

	}

}
