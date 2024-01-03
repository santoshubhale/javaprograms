package method;

import java.util.Arrays;

class EvenDemo {

	public void even() {
		int count=0;
		for(int i=20; i<=40; i++) {
			if((i%2)==0) {
				count=count+1;
			}
		}
		System.out.println("Total count:-"+count);
		int x[]=new int[count];
		int k=0;
		for(int j=20; j<=40; j++) {
			if((j%2)==0) {
				x[k]=j;
				k++;
			}
		}
		for(int z=1; z<=x.length-1; z++ ) {
			System.out.println(x[z]);
		}
		
	}
}

public class EvenNo1DArray {

	public static void main(String[] args) {
		EvenDemo ed = new EvenDemo();
		ed.even();

		
	}
}
