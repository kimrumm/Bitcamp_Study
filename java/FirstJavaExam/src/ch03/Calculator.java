package ch03;

import java.util.Scanner;

public class Calculator {
	
	final float PI = 3.14f;
	
	// ① 덧셈
	long plus (int a, int b) {
		return (long)a + b;
	}
	// ② 뺄셈
	long minus (int a, int b) {
		return (long)a - b;
	}
	// ③ 곱셈
	long multi (int a, int b) {
		return (long)a * b;
	}
	
	// ④ 나눗셈
	float div (int a, int b) {
		return (float) a / b;
	}
	
	// ⑤ 원의 둘레
	double cirCum (double r) {
		return 2 * PI * r;
	}
	// ⑥ 원의 넓이
	// 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	double cirArea (double r) {
		return PI * r * r;
	}

	public static void main(String[] args) {
		// ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
		// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 
		// 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드에 추가해봅시다.
		
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("       [ 신명나는 계산기 ]       ");
		System.out.println("------------------------------");
		
		System.out.println("========== [ 덧셈 ]==========");
		System.out.println("첫번째 숫자를 입력해주세요>");
		int a1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요>");
		int b1 = sc.nextInt();
		
		System.out.println("결과 : " + a1 +" + "+ b1 + " = " + cal.plus(a1, b1));
		System.out.println();
		
		System.out.println("==========[ 뺄셈 ]==========");
		System.out.println("첫번째 숫자를 입력해주세요>");
		int a2 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요>");
		int b2 = sc.nextInt();
		
		System.out.println("결과 : " + a2 +" - "+ b2 + " = " + cal.minus(a2, b2));
		System.out.println();
		
		System.out.println("==========[ 곱셈 ]==========");
		System.out.println("첫번째 숫자를 입력해주세요>");
		int a3 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요>");
		int b3 = sc.nextInt();
		
		System.out.println("결과 : " + a3 +" x "+ b3 + " = " + cal.multi(a3, b3));
		System.out.println();
		
		System.out.println("==========[ 나눗셈 ]==========");
		System.out.println("첫번째 숫자를 입력해주세요>");
		int a4 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요>");
		int b4 = sc.nextInt();
		
		System.out.println("결과 : " + a4 +" % "+ b4 + " = " + cal.div(a4, b4));
		System.out.println();
		
		System.out.println("======[ 반지름을 입력해주세요 ]======");
		double r = sc.nextDouble();
		System.out.println("입력받은 반지름의 길이 : " + r);
		System.out.println("원의 둘레 : " + cal.cirCum(r));
		System.out.println("원의 넓이 : " + cal.cirArea(r));
		

	}

}
