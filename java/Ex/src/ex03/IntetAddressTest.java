package ex03;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntetAddressTest {

	public static void main(String[] args) {

		String urLstr = "www.bitcamp.co.kr";
		try {
			InetAddress ip = InetAddress.getByName(urLstr);
			
			System.out.println("ȣ��Ʈ �̸� : " + ip.getHostName());
			System.out.println("IP address : " +n ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
