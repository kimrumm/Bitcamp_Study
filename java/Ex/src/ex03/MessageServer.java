package ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessageServer {

	public static void main(String[] args) {

		DataInputStream din = null;
		DataOutputStream dout = null;
		ServerSocket ss = null;
		Socket s = null;

		try {
			ss = new ServerSocket(8888);
			
			System.out.println("���� ����");
			System.out.println("------------------------");

			s = ss.accept();
			System.out.println("clinet ����");
			System.out.println("------------------------");

			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());

			Scanner sc = new Scanner(System.in);

			String str1 = null; // �޴� �޼���
			String str2 = ""; // ������ �޼���

			while (str2.equals("exit")) {
				str1 = din.readUTF();
				System.out.println("Client Message : " +str1);

				str2 = sc.next();
				dout.writeUTF(str2);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			Util.close(din);
			Util.close(s);
			Util.close(dout);
			Util.close(ss);



		}

	}

}
