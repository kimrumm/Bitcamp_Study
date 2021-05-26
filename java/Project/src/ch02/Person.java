package ch02;


 
public class Person {
//	private String perName;
//	private String perNum;
//	private long perResidentA;
//	private String perResidentB;
	
	// 클래스의구성 -> 인스턴스변수, 메소드
	
	//①회원이름을 저장하는 변수
	String name; // 초기화를 생략 가능 
	
	//②회원 전화번호 ( 000-0000-0000 )를 저장하는 변수 -> 문자열 
	String memberPhonNum = "000-000-0000";
	
	//③회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
	//                     문자열              롱타입 
	String perNum1 = "700000- 000000";
	long perNum2 = 700000000000L;
	
	//인스턴스 변수들의 데이터를 출력하는 메소드 
	void showData() {
		System.out.println("회원 이름 : " + this.name);
		System.out.println("회원의 주민번호1 : " + perNum1);
		System.out.println("회원의 주민번호2 : " + perNum2);
		
	}
	
	public static void main(String[] args) {
		// Person  인스턴스 생성
		Person person = new Person();
		System.out.println("이름: "+person.name);
		person.name = "김름름이";
		person.showData();
		
		

	}

}
