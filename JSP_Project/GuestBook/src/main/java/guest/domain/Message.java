//@ 작성일 : 2021. 7. 28.
// 6. 데이터베이스와 일치 시켜서 빈즈 생성 ->writemessage.jsp
// DAO로 보내는 빈즈 (아래 포멧에 맞춰서 넣는다.)
package guest.domain;

import java.sql.Timestamp;


public class Message {
	//DB 테이블 컬럼과 일치 (나중에 MyBatis 쓸 때 필요)
	private int messageId;
	private String guestName;
	private String password;
	private String message;
	private Timestamp regdate;
	
	//디폴트 생성자
	public Message() {
	}

	public Message(int messageid, String guestname, String password, String message, Timestamp regdate) {
		this.messageId = messageid;
		this.guestName = guestname;
		this.password = password;
		this.message = message;
		this.regdate = regdate;
	}

	// 사용자로 부터 받은 데이터 (MessageRequest)를 가지고 Message 객체를 만들 수 있는 생성자를 만든다.
	// messageId는 자동 증가, redate는 DB에서 처리.
	public Message(String guestName, String password, String message) {
		this.guestName = guestName;
		this.password = password;
		this.message = message;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", guestName=" + guestName + ", password=" + password + ", message="
				+ message + ", regdate=" + regdate + "]";
	}
	
	
	
	
	
	
	

}
