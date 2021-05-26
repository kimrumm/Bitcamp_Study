package ch06;

public class ScoreManager {

	public static void main(String[] args) {
		// 문제 해결을 하기위해서 절차를 정리 할 필요가 있다 ->알고리즘 ->문제해결을 하는 과정 -> 내머릿속에 있는걸 그대로 옮기는 것.

		// 1.국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.

		// 국어,영어,수학 점수 저장 배열
		int[] korScore = new int[10];
		int[] engScore = new int[10];
		int[] mathScore = new int[10];

		// 점수를 입력
		// 국어점수 10개배열, 영어점수 10개배열, 수학점수 10개 배열
		korScore[0] = 100;
		korScore[1] = 63;
		korScore[2] = 77;
		korScore[3] = 96;
		korScore[4] = 43;
		korScore[5] = 56;
		korScore[6] = 89;
		korScore[7] = 90;
		korScore[8] = 62;
		korScore[9] = 89;

		// 점수를 모두 출력,
		// 배열의 모든 요소를 출력
		// 배열 -> 일괄처리
//		System.out.println(korScore[0]);
//		System.out.println(korScore[1]);
//		System.out.println(korScore[2]);

		// 반복문을 이용해서 공통된 작업을 처리한다. ->일괄처리
		for (int idx = 0; idx < korScore.length; idx++) {
			System.out.println(korScore[idx]);
		}

		// 평균 점수를 출력하는 프로그램을 작성하자.
		// 합을 구하고 평균
		// sum = sum + i -> sum+=i

		// 합을 구하기 위한 변수 sum 선언
		int sum = 0;
		for (int i = 0; i < korScore.length; i++) {
			sum = sum + korScore[i];

		}
		System.out.println("국어점수의 합 : " + sum);

		// 평균 -> 총합/배열의 개수
		float avg = (float) sum / korScore.length; // 인티저타입이라 캐스팅해줘야한다.
		System.out.println("국어 점수의 평균 : " + avg);

	}

}
