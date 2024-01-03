package com.java.src;

public interface InterfaceAndAbstract {
	void a();
	void b();
	void c();
	void d();

}
abstract class ab implements InterfaceAndAbstract{
	public void c() {
		System.out.println("i am c");
	}
	
}
class cd extends ab{
	@Override
	public void a() {
		System.out.println("i am a");
	}

	@Override
	public void b() {
		System.out.println("i am b");
		
	}

	@Override
	public void d() {
		System.out.println("i am d");
		
	}
}
	class Abcdtest{
		public static void main(String[] args) {
			InterfaceAndAbstract ia = new cd();
			ia.a();
			ia.b();
			ia.c();
			ia.d();
			
		}
	
	
}
