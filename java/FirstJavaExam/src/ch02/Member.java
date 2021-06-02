package ch02;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

//		1. String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
//		String name;

//		2. int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
//		int age;

//		3. double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
//		double height;

//		4. boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다. 
//		boolean hasBook;

//		5. 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.

		Scanner sc = new Scanner(System.in);
		System.out.println("<이름,나이,키,책의 보유 여부 확인>");
		System.out.println("---------------------------");
		System.out.println("이름을 입력하세요."); // String + String
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		System.out.println("책보유하고 있습니까?(네,아니오)");
		String hasBook = sc.next();
		
		//삼항연산자(true,false) or 메세지 출력을 위한 변수 생성 
		String msg = null;
		
		if (hasBook.equals("네")) {
			msg = "책이있습니다.";
		} else {
			msg = "책이 없습니다.";
		}

		System.out.println("---------------------------");
		System.out.println("<결과> " + "이름: " + name + ", 나이: " + age + "살, 키: " + height + "cm, 책보유여부: " + msg);

	}

}
