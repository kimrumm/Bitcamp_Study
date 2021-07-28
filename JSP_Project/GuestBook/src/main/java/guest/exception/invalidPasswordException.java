//@ 작성일 : 2021. 7. 28.

package guest.exception;

public class invalidPasswordException  extends Exception {

	public invalidPasswordException() {
		super("비밀번호가 일치하지않습니다.");
	}
	
	

}
