package ex01;

public class MiniAndMax {
//		문제 1.
//		int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최대값,
//		그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의.
	static int arr[] = {1,5,7,10,62,4};
	static int miniValue = arr[0];
	static int maxValue = arr[0];
	
	
// 최소값 반환
	public static int miniValue(int[] arr) { 
		for(int i=0; i < arr.length; i++) {
			if(arr[i] < miniValue) {
				miniValue = arr[0];
				
			}
			
		}
		return miniValue;
	} 
	public static int maxValue(int[] arr) { 
		
	} // 최대값 반환
	
//		위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의.

	public static void main(String[] args) {
		MiniAndMax mam = new MiniAndMax(); 
		
		System.out.println();
		
		
		
//		두 매소드 실행을 확인인하기 위한 main 메소드 정의.
//		int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 배열의 길이는 임의로 결정

		​
		

	}

}
