package guest.domain;

import com.sun.jmx.snmp.Timestamp;

//6. 사용자로부터 데이터를 받아 저장하는 빈즈
public class Message {
	private int mesageId;
	private String guestName;
	private String password;
	private String message;
	private Timestamp regdate;
	
	public Message() {}
	
	public Message(int mesageId, String guestName, String password, String message, Timestamp regdate) {
		this.mesageId = mesageId;
		this.guestName = guestName;
		this.password = password;
		this.message = message;
		this.regdate = regdate;
	}
	//
	public Message(String guestName, String password, String message) {
		this.guestName = guestName;
		this.password = password;
		this.message = message;
	}

	public int getMesageId() {
		return mesageId;
	}

	public void setMesageId(int mesageId) {
		this.mesageId = mesageId;
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
		return "Message [mesageId=" + mesageId + ", guestName=" + guestName + ", password=" + password + ", message="
				+ message + ", regdate=" + regdate + "]";
	}
	
	
	
	
	

}
