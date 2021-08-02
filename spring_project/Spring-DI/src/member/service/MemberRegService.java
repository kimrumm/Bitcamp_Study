package member.service;



import java.util.Date;

import member.dao.Dao;
import member.domain.Member;
import member.domain.RegReqest;

public class MemberRegService {
	
	//Dao dao = new MemberDao();
	Dao dao ;
	
	public MemberRegService(Dao dao) { //dao로 받는다
		this.dao = dao;
	}

	public void regMember(RegReqest reqest) throws Exception {
		
		// 중복 이메일 체크
		Member member = dao.selectByEmail(reqest.getEmail());
		
		// 중복확인
		if(member != null) {
			throw new Exception("중복 이메일 !!");
		}
		
		
		Member newMember = new Member(0, reqest.getEmail(), reqest.getPassword(), reqest.getName(),new Date());
		
		dao.insert(newMember);
	}
}
