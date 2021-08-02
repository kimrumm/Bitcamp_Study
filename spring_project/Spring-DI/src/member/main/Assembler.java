package member.main;

import member.dao.GuestDao;
import member.dao.MemberDao;
import member.service.ChangePasswordSerivce;
import member.service.MemberRegService;

public class Assembler {
	
	// 컨테이너 : 인스턴스를 관리s -> 생성, 보관, 실행, 필요한 객체를 반환, 소멸 
	// 조립기 클래스의 역할
	// 각각의 인스턴스를 생성 
	// 의존 주입을 해준다 (의존성을 낮추는것)
	// 필요한 객체를 반환 해주는 기능
	// 싱글톤의 효과를 가져온다. 
	// 최초 어셈블러가 만들어지면 각각 하나씩 만들어진다.
	
	// 필요한 서비스를 조립기가 보관한다.
	private MemberDao dao;
	private MemberRegService regService;
	private ChangePasswordSerivce passwordSerivce;
	private GuestDao gDao;
	
	public Assembler() { //초기화
		// 인스턴스를 생성 -> 의존 주입 
		dao = new MemberDao();
		gDao = new GuestDao();
		
		
		regService = new MemberRegService(dao);
		passwordSerivce = new ChangePasswordSerivce(dao);
		
	}

	// 반환 (필요할때마다 반환해서 사용 가능)
	public MemberDao getDao() {
		return dao;
	}

	public MemberRegService getRegService() {
		return regService;
	}

	public ChangePasswordSerivce getPasswordSerivce() {
		return passwordSerivce;
	}
	
	
	
}
