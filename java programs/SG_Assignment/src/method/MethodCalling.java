package method;
//Q: WAM where the output of method1() is a input to method2()?
class Method{
	
	public void method1() {
		System.out.println("Hi Bangalore");
		method2("Karnataka");
	}
	
	public void method2(String name) {
		System.out.println("State is:- "+ name);
		method3(20);
	}
	public void method3(int x) {
		System.out.println(x);
	}
	
}

public class MethodCalling {
	public static void main(String[] args) {
		Method m = new Method();
		m.method1();
	//	m.method2("Gulbarga");
		
	}

}
