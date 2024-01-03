package constructor;

class Constructor {
	Constructor(int a) {
		System.out.println("Constructor 1");

	}

	Constructor(int a, String s) {
		System.out.println("Constructor 2");

	}

	Constructor(String s, int a) {
		System.out.println("Constructor 3");

	}

	Constructor(int a, double d) {
		System.out.println("Constructor 4");

	}
}

public class ConstructorOverloding {

	public static void main(String[] args) {
		Constructor c = new Constructor(1);
		Constructor c1 = new Constructor(1,"s");
		Constructor c2 = new Constructor("a",2);
		Constructor c3 = new Constructor(1,1.1);
		

	}

}
