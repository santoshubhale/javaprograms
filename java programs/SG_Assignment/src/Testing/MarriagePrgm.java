package Testing;

public class MarriagePrgm {

	public static void main(String[] args) {
		String gender = "female";
		int age = 1;
		if((gender.equals("male"))&& age>=21) {
			System.out.println("Male is eligible for marriage");
		}else if((gender.equals("female"))&& age>=18) {
			System.out.println("Female is eligible for marriage");
		}else {
			System.out.println(gender+" not eligible for marriage");
		}
	}
}