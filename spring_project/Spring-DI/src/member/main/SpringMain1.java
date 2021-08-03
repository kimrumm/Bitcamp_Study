package member.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import member.domain.RegRequest;
import member.service.ChangePasswordService;
import member.service.MemberRegService;

public class SpringMain1 {

	static ApplicationContext ctx; 
	
	public static void main(String[] args) {
		
		//ctx = new GenericXmlApplicationContext("classpath:appCtx1.xml");
		ctx = new GenericXmlApplicationContext("classpath:appCtx3.xml");
		
		Scanner sc = new Scanner(System.in);
		
		//하나만 만들어놓고 쓰기 위해서
		
		while (true) {
			printMenu();
			
			String command = sc.nextLine();
			//프로그램의 종료 분기
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				return;
			}
			if (command.startsWith("new")) {
				String[] values = command.split(" "); // 자르고싶은 구분 넣어주기
				// values[0] -> king@gmail.com
				processNewMember(values);
				continue;
				
			}
			
			if (command.startsWith("change")) { //수정처리
				String[] values = command.split(" ");
				processChangePw(values);
				
			}
			
		}

	}
	
	private static void processChangePw(String[] values) {
		// 비밀번호 변경
		
		//ChangePasswordSerivce serivce = new ChangePasswordSerivce(dao);
		//ChangePasswordSerivce serivce = assembler.getPasswordSerivce(); // 어셈블러에게 가져오도록 요청 
		ChangePasswordService serivce = ctx.getBean("changePwServie", ChangePasswordService.class);
		try {
			serivce.changePassword(values[1], values[2], values[3]);
			
			System.out.println("비밀번호를 변경했습니다.");
			
		} catch (Exception e) {
			//e.printStackTrace()
			System.out.println(e.getMessage());
		}
	}

	private static void processNewMember(String[] values) {
		// MemberRegService 이용해서 정보를 저장한다.
		
		//MemberRegService service = new MemberRegService(dao);
		//MemberRegService service = assembler.getRegService();
		MemberRegService service = ctx.getBean("regService", MemberRegService.class);
		RegRequest request = new RegRequest();
		request.setEmail(values[1]);
		request.setName(values[2]);
		request.setPassword(values[3]);
		request.setConfirmPassword(values[4]);
		
		// 비밀번호가 다를때
		if(!request.isPasswordEqualToConfirmPassword()) {
			System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
			return; // 다시입력 할 수 있게
		}
		
		try {
			service.regMember(request);
		
			System.out.println("등록되었습니다^^");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());//서비스할때 넣은 메세지를 출력 가능
		}
		
	}

	static void printMenu() {
		System.out.println();
		System.out.println("명령어 사용법");
		System.out.println("회원 등록-----------------------");
		System.out.println("new 이메일 이름 비밀번호 비밀번호 확인");
		System.out.println("new king@gmail.com King 123 123");
		System.out.println("회원 수정------------------------");
		System.out.println("change 이메일 현재비번 새로운비번");
		System.out.println("change king@gmail.com 123 0000");
		System.out.println("-------------------------------");
	}

}
