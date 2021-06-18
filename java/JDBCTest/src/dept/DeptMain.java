package dept;

import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {

		DeptManager manager = new DeptManager(DeptDao.getInstance());
		Scanner sc = new Scanner(System.in);
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			while (true) {
			System.out.println("부서관리 프로그램");
			System.out.println("------------------------------------");
			System.out.println("1. 부서 리스트");
			System.out.println("2. 부서 정보 입력");
			System.out.println("3. 부서 정보 수정");
			System.out.println("4. 부서 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("------------------------------------");
			System.out.println("원하시는 기능의 번호를 입력해주세요.");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				manager.deptList();
				break;
			case 2 :
				manager.inputDate();
				break;
			case 3 :
				manager.editDept();
				break;
			case 4 :
				manager.delDept();
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
				//manager.inputDate();
			//manager.editDept();
			manager.delDept();
			manager.deptList();
			}
		
		

			// DeptDao dao = DeptDao.getInstance(); // new DeptDao();

			/*
			 * List<Dept> list = dao.getDeptList(conn);
			 * 
			 * for(Dept dept : list) { System.out.println(dept); }
			 */

			// Scanner sc = new Scanner(System.in);

			/*
			 * System.out.println("부서입력을 시작합니다.");
			 * System.out.println("부서번호 부서이름 부서위치 순으로 입력해주세요.");
			 * System.out.println("예) 50 dev seoul"); String deptData = sc.nextLine();
			 * String[] deptDatas = deptData.split(" ");
			 * 
			 * // Dept 객체 생성 -> Dao 메소드 호출 Dept dept = new
			 * Dept(Integer.parseInt(deptDatas[0]), deptDatas[1], deptDatas[2]);
			 * 
			 * int result = dao.insertDept(conn, dept); if(result>0) {
			 * System.out.println("입력 성공!"); } else { System.out.println("입력 실패!"); }
			 */

			/*
			 * System.out.println("부서수정을 시작합니다.");
			 * System.out.println("수정하고자하는 부서번호 새부서이름 새부서위치 순으로 입력해주세요.");
			 * System.out.println("예) 50 dev seoul"); String deptData = sc.nextLine();
			 * String[] deptDatas = deptData.split(" ");
			 * 
			 * // Dept 객체 생성 -> Dao 메소드 호출 Dept dept = new
			 * Dept(Integer.parseInt(deptDatas[0]), deptDatas[1], deptDatas[2]);
			 * 
			 * int result = dao.editDept(conn, dept); if(result>0) {
			 * System.out.println("수정 성공!"); } else { System.out.println("수정 실패!"); }
			 */

			/*
			 * System.out.println("부서 정보를 삭제합니다."); System.out.println("삭제할 부서번호를 입력해주세요.");
			 * String deptno = sc.nextLine(); int result = dao.deleteDept(conn,
			 * Integer.parseInt(deptno));
			 * 
			 * if(result>0) { System.out.println("삭제 완료!"); } else {
			 * System.out.println("삭제 실패 : 해당 번호의 부서가 존재하지 않습니다."); }
			 */

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
