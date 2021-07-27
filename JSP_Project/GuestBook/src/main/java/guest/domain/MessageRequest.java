//@ 작성일 : 2021. 7. 28.
// 5.빈즈 생성 ->Message.java
// 사용자로부터 데이터를 받는다. 

package guest.domain;

public class MessageRequest {
	
	private String guestname;
	private String password;
	private String message;
	
	// 톰캣 컨테이너 인스턴스 생성 
	// -> Setter 메소드를 통해서 
	// 파라미터 name="guestname" 가 있으면 
	// setguestname를 가지고 셋팅해준다.
	public String getGuestname() {
		return guestname;
	}
	public void setGuestname(String guestname) {
		this.guestname = guestname;
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
	
	
	// MessageRequest => Message (해당 데이터를 가지고 메세지 객체를 만들어준다.)
	public Message toMessage() {
		return new Message(guestname, password, message);
	}
	@Override
	public String toString() {
		return "MessageRequest [guestname=" + guestname + ", password=" + password + ", message=" + message + "]";
	}
	
	
	

}
