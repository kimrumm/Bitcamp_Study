package ex03;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	public static void main(String[] args) {
		
		// SocketServer �� IP�� port ��ȣ�� �����û : socket ��ü�� ����
		try {
			Socket socket = new Socket("localhost", 9999);
			
			if(socket != null) {
				System.out.println("���� ���� �Ϸ�");
			}
			
			DataOutputStream dout = new DataOutputStream(null)
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
