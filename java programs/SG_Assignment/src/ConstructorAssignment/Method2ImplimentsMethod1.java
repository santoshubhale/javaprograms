package ConstructorAssignment;

class Salary{
	// WAM to where output of the method 1 is a input to method ?
	// ex :- method()1-> monthly salary
	//method:->2 should take the output of the method one & calculate CTC
	public int Ctc(){
		int salary =30000;
	
		return salary*12;
	}
}
public void method2(Ctc()) {
	

}
public class Method2ImplimentsMethod1 {

	public static void main(String[] args) {
		Salary s = new Salary();
		s.Ctc();
		System.out.println("Annual ctc"+s.Ctc());
	}

}
}