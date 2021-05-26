package ch03;

import java.util.Scanner;

//1. Calculator 클래스를 정의해봅시다.

public class Calculator {


	// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 반환하는 메소드를 정의
	int sum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	// ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 반환하는 메소드를 정의
	int minus(int n1, int n2) {
		int minus = n1 - n2;
		return minus;
	}

	// ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 반환하는 메소드를 정의
	int multi(int n1, int n2) {
		int multi = n1 * n2;
		return multi;
	}

	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	double div(int n1, int n2) {
		double div = n1 / n2;
		return div;

	}

	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	double area(int PI, int r) {
		double area = 2 * PI * r;
		return area;

	}

	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	double lenght(int PI, int r) {
		double lenght = PI * r * r;
		return lenght;
	}
	
	public static void main(String[] args) {
	//⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
		Calculator cal = new Calculator();
		System.out.println(cal.sum(10, 56));
		System.out.println(cal.minus(50, 5));
		System.out.println(cal.multi(6, 5));
		System.out.println(cal.div(11, 3));
		System.out.println(cal.area(30, 2));
		System.out.println(cal.lenght(30, 2));
		
	//⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드에 추가해봅시다.
		Scanner sc = new Scanner(System.in);
		System.out.println("더하기 ");
		cal.sum = sc.nextInt();

	}
}
