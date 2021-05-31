package ex.infomanager2;

import java.util.Scanner;

public class FriendBook {
	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(100);

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("** 메뉴 선택 ************");
			System.out.println(Menu.HIGH_FRI + ".고교 친구 정보 입력");
			System.out.println(Menu.UNIV_FRI + ".대학 친구 정보 입력");
			System.out.println(Menu.SHOW_ALL + ".전체 정보 출력");
			System.out.println(Menu.SHOW_BAGIC + ".기본 정보 출력");
			System.out.println(Menu.EXIT + ".프로그램 종료");

			System.out.println("메뉴를 선택하세요>>");
			int choice = Integer.parseInt(s.nextLine());

			switch (choice) {
			case Menu.HIGH_FRI:
			case Menu.UNIV_FRI:
				handler.addFriend(choice);
				break;
			case Menu.SHOW_ALL:
				handler.showAllData();
				break;
			case Menu.SHOW_BAGIC:
				handler.showAllBasicData();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;

			}

		}

	}

}
interface Menu {
	int HIGH_FRI = 1; //public static final 생략가능 
	int UNIV_FRI = 2;
	int SHOW_ALL = 3;
	int SHOW_BAGIC = 4;
	int EXIT = 5;
}
