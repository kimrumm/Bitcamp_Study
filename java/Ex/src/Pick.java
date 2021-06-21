import java.util.ArrayList;
import java.util.Collections;

public class Pick {

	// 팀 구성 결과를 저장할 가변 배열 생성
	static String[][] team;

	public static void main(String[] args) {

		// 팀 구성 결과를 저장할 배열 생성
		team = new String[6][];
		team[0] = new String[5]; // A-1
		team[1] = new String[5]; // A-2
		team[2] = new String[5]; // A-3
		team[3] = new String[4]; // B-1
		team[4] = new String[4]; // B-2
		team[5] = new String[4]; // B-3

		// 배열 생성 : new String[2][] : 가변 배열
		// 배열 : 인스턴스
		String[][] members = {
				{ 	"곽민주", "김명호", "김성진", "김승민", "김아름", 
					"김용민", "김은비", "김재준", "김훈", "도용성", 
					"박상명", "신은경", "이우리", "정소연","황지원" },
				{ 	"이재훈", "윤병우", "정다예", "이현우", 
					"류한성", "위세라", "성종원", "조성덕", 
					"손형준", "이윤성", "김은선", "채호연" } 
				};

		// Collection 객체의 메소드 사용을 위해 객체 생성
		ArrayList<String> classA = new ArrayList<String>();
		ArrayList<String> classB = new ArrayList<String>();

		// List 요소 삽입
		for (int i = 0; i < members[0].length; i++) {
			classA.add(members[0][i]);
		}
		for (int i = 0; i < members[1].length; i++) {
			classB.add(members[1][i]);
		}

		for (int i = 0; i < 10000; i++) {
			// Collections 클래스는 Collection 객체들을 다루는 메소드들을 제공
			Collections.shuffle(classA);
			Collections.shuffle(classB);
		}

//		for (String name : classA) {
//			System.out.print(name + " ");
//		}
//		System.out.println("\n-------------------------------------");
//		for (String name : classB) {
//			System.out.print(name + " ");
//		}

		System.out.println("\n■ 팀구 성을 시작합니다.");

		displayPicker(classA, 'A', 1500);
		displayPicker(classB, 'B', 1500);
	}

	public static void displayPicker(ArrayList<String> memberList, char type, int delay) {

		int index = 0;
		int start = type == 'A' ? 0 : 3;

		for (int i = start; i < start + 3; i++) {
			for (int j = 0; j < team[i].length; j++) {
				team[i][j] = memberList.get(index++);
			}
		}

		for (int i = start; i < start + 3; i++) {
			try {
				Thread.sleep(delay + 1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			System.out.println();
			System.out.println("======================");
			System.out.println(type + " - " + (type == 'A' ? i + 1 : i - 2));
			System.out.println("----------------------");

			for (String s : team[i]) {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(s);
			}

		}

	}

}