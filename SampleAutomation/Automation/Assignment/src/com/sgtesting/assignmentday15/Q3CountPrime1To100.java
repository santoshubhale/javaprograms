package com.sgtesting.assignmentday15;
class PrimeDemo2{
	void prime() {
		int count=0;
		for(int no=1; no<100; no++) {
			if(no>1) {
			int flag=0;
			for(int i=2; i<no; i++) {
				if(no%i==0) {
					flag=flag+1;
					break;
				}
			}
			if(flag==0) {
				count++;
			}
		}
	}
		System.out.println("Total count :- "+count);
}
}
public class Q3CountPrime1To100 {

	public static void main(String[] args) {
		PrimeDemo2 pd = new PrimeDemo2();
		pd.prime();

	}

}
