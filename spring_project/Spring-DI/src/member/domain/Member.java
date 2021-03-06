package member.domain;

import java.util.Date;

public class Member {
	
	private int id;
	private String email;
	private String password;
	private String name;
	private Date regDate;
	
	//생성자
	public Member(int id, String email, String password, String name, Date regDate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}


	public String getName() {
		return name;
	}


	public Date getRegDate() {
		return regDate;
	}

	
	
	// 비밀번호 변경 메소드			//두개를 받는다.
	public void changePassword(String oldPw, String newPw) throws Exception {
		
		if(password.equals(oldPw)) {
			password = newPw; // 전달받은것대입
			
		} else {
			throw new Exception("비밀번호 불일치");
		}
		
	}
	

}
