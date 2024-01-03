import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DROPDOWNS {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bablu\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver Var = new ChromeDriver();
	Var.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}

}
