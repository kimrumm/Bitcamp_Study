//@ 작성일 : 2021. 7. 28.
// 사용자가 지정하는 예외 클래스 

package guest.exception;

public class MessageNotFoundException extends Exception { // extends Exception을 상속 받는다. 

	//슈퍼 클래스에서 Sring을 받는다.
	public MessageNotFoundException(int mid) {
		super(mid + "번 게시물은 존재하지 않습니다.");
	} 
	
	

}
