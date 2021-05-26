package ch06;

//1.국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.

public class Student {
	// ①학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
	// ②변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다

	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;

	public Student(String name, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ③총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.

	int getSum() {
		return koreanScore + englishScore + mathScore;
	}

	int getAvg() {
		return getSum() / 3;
	}

	void stuInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("국어점수 : " + koreanScore);
		System.out.println("영어점수 : " + englishScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + getSum());
		System.out.println("평균 : " + getAvg());
	}

	public static void main(String[] args) {

//①Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.		
		
		Student[] stu = new Student[10];

		stu[0] = new Student("김아름", 80, 60, 80);
		stu[1] = new Student("박사장", 80, 68, 80);
		stu[2] = new Student("아무개", 80, 20, 80);
		stu[4] = new Student("김박박", 80, 20, 80);
		stu[5] = new Student("알라뷰", 80, 84, 80);
		stu[6] = new Student("아이고", 80, 68, 80);
		stu[7] = new Student("잠만보", 80, 25, 80);
		stu[8] = new Student("김똑똑", 80, 60, 80);
		stu[9] = new Student("에이스", 80, 60, 80);
		stu[10] = new Student("침대", 80, 60, 80);

//③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		for(int i=0; i< stu.length;i++) {
			System.out.println(stu[i]);
		}
		System.out.println();
		System.out.println(stuInfo);

	}
}
