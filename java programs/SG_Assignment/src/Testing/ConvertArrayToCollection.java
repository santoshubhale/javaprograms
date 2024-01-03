package Testing;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToCollection {

	public static void main(String[] args) {
		//Q12: Is it possible to convert the array to collection?
		String str[] = {"a","b","c","d","e","f"};
		List<String> list = Arrays.asList(str);
		System.out.println(list);
		
		System.out.println("********************");
		
		Integer it []= {1,2,3,4,5,6,7,89,};
		List<Integer> olist = Arrays.asList(it);
		System.out.println(olist);

	}

}
