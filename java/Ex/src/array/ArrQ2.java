package array;

public class ArrQ2 {

	public static void addOneDArr(int[][] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] += add;

			}
		}
	}

	public static void main(String[] args) {
		ArrQ2 a1 = new ArrQ2();
		int sum = 0;
		int[][] arr = { { 1, 2, 3, 4, 5 }, 
					  { 2, 3, 4, 5, 6 }, 
				      { 3, 4, 5, 6, 7 }, 
				      { 4, 5, 6, 7, 8 }, 
				      { 5, 6, 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				sum = sum + arr[i][j];
			}

		}
		System.out.println("합계 : " + sum);
	}

}
