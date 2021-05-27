package ex01;

import java.util.Scanner;

public class MiniAndMax {

// 최소값 반환
	public static int miniValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}

		}
		return min;
	}

// 최대값 반환
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MiniAndMax arr = new MiniAndMax();

		// 사용자로 부터 입력받기
		int[] arrInt = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개를 입력하세요 : ");
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = sc.nextInt();
		}

		System.out.println("최소값 : " + miniValue(arrInt));
		System.out.println("최대값 : " + maxValue(arrInt));

	}

}
