package ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) {

		Socket socket = null;
		DataInputStream din = null;
		DataOutputStream dout = null;

		try {
			socket = new Socket("localHost", 8888);

			din = new DataInputStream(socket.getInputStream());
			dout = new DataOutputStream(socket.getOutputStream());

			Scanner sc = new Scanner(System.in);

			String str1 = null; // �޴� ������
			String str2 = ""; // ������ ������

			while (!str2.equals("exit")) {

				// ������ ����
				str2 = sc.nextLine();
				dout.writeUTF(str2);

				str1 = din.readUTF();
				System.out.println("ServerMessage" + str1);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Util.close(socket);

		}

	}

}
