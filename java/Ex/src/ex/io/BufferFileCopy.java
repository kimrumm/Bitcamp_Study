package ex.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {

	public static void main(String[] args) throws FileNotFoundException {
		
		// 1.  파일을 바이너리 데이터를 읽어올 스트림 생성 : FileInputStream
		try {
			//FileInputStream inputStream = new FileInputStream("origin.pdf");
			InputStream inputStream = new FileInputStream("origin.pdf");
			// 2. 파일을 쓰기 위한 스트림 생성 : FileOutputStream
			//FileOutputStream out = new FileOutputStream("copy.pdf");
			OutputStream out = new FileOutputStream("copy.pdf");
			
			// 카피한 데이터의 크기 
			int copyByte = 0;
			// 파일에서 읽어올 바이트 데이터 
			int bData = -1;
			
			while(true) {
				bData = in.read();
				
				// 탈출의 조건  : 파일의 모든 데이터를 읽은 경우 
				if(bData==-1	) {
					break;
				}
				
				// 출력 : 파일에 데이터를 쓴다 
				out.write(bData);
				copyByte++;
			}
			
			// 스트림 닫기
			in.close();
			out.close();
			
			System.out.println("복사완료 !! 복된된 바이트 사이즈 : " + copyByte + "byte 사이즈 : " + bData);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
