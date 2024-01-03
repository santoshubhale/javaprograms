package javascanner;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo2 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.facebook.com");
			
			System.out.println("ipaddress:-"+ip.getHostName());
			System.out.println("ip address:-"+ip.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}

	}

}
