package ex.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class ObjectSerializable {

	public static void main(String[] args) {
		
		// 인스터스를 저장
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			
			out.writeObject(new Circle(1, 1, 2.4));
			out.writeObject(new Circle(3, 5, 7.9));
			out.writeObject("Hello");
			
			ArrayList<Circle> list = new ArrayList<Circle>();
			list.add(new Circle(1, 2, 3.4));
			list.add(new Circle(5, 2, 3.4));
			list.add(new Circle(9, 2, 3.4));
			list.add(new Circle(21, 2, 3.4));
			list.add(new Circle(31, 2, 3.4));
			out.writeObject(list);
			
			out.close();
			
			System.out.println("인스턴스 저장 완료");
			
			//인스턴스 복
			ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("Object.ser"));

			// 복원 순서는 저장 순서에 맞게 복원
			Circle c1 = (Circle) in.readObject();
			Circle c2 = (Circle) in.readObject();
			String str = (String) in.readObject();
			
			ArrayList<Circle> list2 = (ArrayList<Circle>) in.readObject();
			
			
			c1.showData();
			c2.showData();
			
			
					
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}

 class Circle implements Serializable {
	 
	 // implements Serializable : 직렬화 대상임을 의미
	 
	 int x;
	 int y;
	 transient double r;
	
	//생성자
	public Circle(int x, int y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void showData() {
		System.out.println("원점 ["+x+","+y+"]");
		System.out.println("반지름 : " + r);
		System.out.println(ser);
		
	}
	 
	 
 }