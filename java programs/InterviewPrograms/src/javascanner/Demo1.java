package javascanner;

import java.net.*;

public class Demo1 {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://sgtestinginstitute.com/login.php");
			System.out.println("port:-" + url.getPort());
			System.out.println("hostname:-" + url.getHost());
			System.out.println("protocal:-" + url.getProtocol());
			System.out.println("filename:-" + url.getFile());
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			System.out.println("Hacked");
		}
	}

}
