package arrayprogram;

public class MoreNoDivision {
// Programmatically no in bet'n 1 to 100 which are divisible by 3 and 6 and 9 into 1-d array 
//	and read the element in reverse order
	public static void main(String[] args) {
		
		int count=0;
		for(int i=1; i<=200; i++) {
			if((i%3==0)&&(i%6==0)&&(i%9==0)) {
				count++;
			}
		}
			System.out.println("Total count"+count);
			
			int x[]= new int[count];
			int k=0;
			for(int j=1; j<=200; j++) {
				if((j%3==0)&&(j%6==0)&&(j%9==0)) {
					x[k]=j;
					k++;
					
				}
			}
			for(int z=x.length-1; z>=0;z--) {
				System.out.println(x[z]);
			}
		}

	}


