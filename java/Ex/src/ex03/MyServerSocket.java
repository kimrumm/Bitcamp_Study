package ex03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {

	public static void main(String[] args) {
		
		try {
			ServerSocket  serverSocket = new ServerSocket(9999);
			
			System.out.println("���� ���� !");
			
			Socket socket = serverSocket.accept(); // Socket���� ���� ��û�� �ö����� ��� 
			
			if(socket != null) {
				System.out.println("Ŭ���̾�Ʈ�� ���� ��û : Socket ����");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
