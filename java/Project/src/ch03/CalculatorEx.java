package ch03;

import java.util.Scanner;
// java.lang.* 

//1. Calculator 클래스를 정의해봅시다.

public class CalculatorEx {
	
	// 클래스 이름 -> 대문자 시작 케멀 케이스
	// 변수 이름 -> 소문자 시작 케멀 케이스
	// 상수 -> 모두 대문자
	double pi = 3.14d;
	float pi1 = 3.14f;
	final float PI = 3.14f; // (값을 변경하지 못하게 상수로 선언)
	
	
	// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 반환하는 메소드를 정의
//	int sum(int n1, int n2) {
//		int sum = n1 + n2;
//		return sum;

	long plus(int num1, int num2) {
//		long result = num1 + num2;
//		return result;
		return (long) num1 + num2;
	}

	// ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 반환하는 메소드를 정의
//	int minus(int n1, int n2) {
//		int minus = n1 - n2;
//		return minus;

	long minus(int num1, int num2) {
		return (long) num1 - num2; // 하나만 붙혀도 되는 이유 : 자동형변환이된다.

	}

	// ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 반환하는 메소드를 정의
//	int multi(int n1, int n2) {
//		int multi = n1 * n2;
//		return multi;
//	}
	long multi(int num1, int num2) {
		return (long) num1 * num2;
	}

	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
//	double div(int n1, int n2) {
//		double div = n1 / n2;
//		return div;
	double div(int num1, int num2) {
		return (double) num1 / num2;

	}

	

	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	float cirCum(float r) {
		return 2 * PI * r; // int * float * float
	}

	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	float cirArea(float r) {
		return PI * r * r;
	}

	public static void main(String[] args) {
		// ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
		CalculatorEx cal = new CalculatorEx();

		System.out.println(cal.PI);
		
		System.out.println("10 + 56 = "+cal.plus(10, 56));
		System.out.println(cal.minus(50, 5));
		System.out.println(cal.multi(6, 5));
		System.out.println(cal.div(11, 3));
		System.out.println(cal.cirCum(32));
		System.out.println(cal.cirCum(32));

//		// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main()
//		// 메소드에 추가해봅시다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("더하기 ");
//		cal.plus = sc.nextInt();
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("덧셈을 합니다.\n숫자 입력해주세요. ");
		int num1 = scanner.nextInt();
		System.out.println("숫자를 입력해주세요.");
		int num2 = scanner.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + cal.plus(num1, num2));
		
		System.out.println("-------------------------");
		System.out.println("반지름을 입력해주세요.");
		float r = scanner.nextFloat();
		
		System.out.println("입력 받은 반지름의 길이 : " + r);
		System.out.println("원의 둘레 : " + cal.cirCum(r));
		System.out.println();
		}
	}

