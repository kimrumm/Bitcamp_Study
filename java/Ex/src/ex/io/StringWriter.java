package ex.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) {
		
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("String.txt"));
			System.out.println("쓰기시작");
			out.write("손흥민 - 안녕하세요 !! ");
			out.write("반갑습니다.  ");
			out.newLine();
			out.write("2021.06.02");
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("작성 완료");
		
		}

	}

