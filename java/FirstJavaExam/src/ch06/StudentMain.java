package ch06;

public class StudentMain {

	public static void main(String[] args) {
//		3.main()메소드에 아래 내용을 정의해봅시다.
//		①Student 타입의 배열을 선언하고
//		요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] stu = new Student[10];
		
//		②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		stu[0] = new Student("김아름", 12, 50, 60);
		stu[1] = new Student("김똑똑", 76, 50, 60);
		stu[2] = new Student("알리딘", 78, 50, 60);
		stu[3] = new Student("요술이", 54, 50, 80);
		stu[4] = new Student("요정이", 88, 50, 54);
		stu[5] = new Student("키오링", 98, 50, 68);
		stu[6] = new Student("알라뷰", 78, 50, 25);
		stu[7] = new Student("핑킹이", 99, 50, 60);
		stu[8] = new Student("몽글이", 56, 50, 60);
		stu[9] = new Student("푸름이", 45, 50, 60);
		
//		③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		System.out.println("이름\t\t국어\t영어\t수학\t총점 \t평균");
		System.out.println("===========================================================");
		for (int i=0; i <stu.length;i++) {
			System.out.print(stu[i].getName());
			System.out.print("\t\t");
			System.out.print(stu[i].getKoreanScore());
			System.out.print("\t");
			System.out.print(stu[i].getEnglishScore());
			System.out.print("\t");
			System.out.print(stu[i].getMathScore());
			System.out.print("\t");
			System.out.print(stu[i].getSum());
			System.out.print("\t");
			System.out.println(stu[i].getAvg());
			
			
		}



	}

}
