package ch06;

public class Student {
	// 2.Student 클래스를 정의해봅시다.
	// ①학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.

	// ②변수는 캡슐화(정보은닉->정보보호)를 합니다.
	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;

	// getter/setter 메소드를 정의합니다.
	public String getName() {
		return name;
	}

	public Student(String name, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public Student() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	// ③총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.

	int getSum() {
		return this.koreanScore + this.englishScore + this.mathScore;
	}

	float getAvg() {
		return getSum() / 3f; // 형변환 해주기
	}
}
