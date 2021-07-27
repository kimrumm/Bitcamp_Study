//@ 작성일 : 2021. 7. 28.

package guest.domain;

import java.util.List;

public class MessageListview {
	
	//게시물 Message 객체 3개
	private List<Message> messageList; 	// 게시물 Message 객체 3개 
	private int messageTotalCount;		// 전체 게시물의 개수
	private int currentPagenumber;	    // 현재 페이지 번호
	private int pageTotalCount; 		// 페이지의 개수 
	private int messageCountPerpage; 	// 한 페이지에 표현할 메세지의 개수
	private int firstRow;				// DB 게시물의 시작 위치 
	private int endRow;					// 마지막 위치
	
	public MessageListview(List<Message> messageList, int messageTotalCount, int currentPagenumber,
			int messageCountPerpage, int firstRow, int endRow) {
		this.messageList = messageList;
		this.messageTotalCount = messageTotalCount;
		this.currentPagenumber = currentPagenumber;
		this.messageCountPerpage = messageCountPerpage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		calPageTotalCount();
	}

	private void calPageTotalCount() {
		
		if(this.messageTotalCount == 0) {
			this.pageTotalCount = 0;
		} else {
			// 10 / 3 -> 3   10%3> 0 -> 3+1
			this.pageTotalCount = this.pageTotalCount / this.messageCountPerpage;
			if(this.pageTotalCount / this.messageCountPerpage > 0) {
				this.pageTotalCount++;
			}
		}
		
		
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public int getMessageTotalCount() {
		return messageTotalCount;
	}

	public int getCurrentPagenumber() {
		return currentPagenumber;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public int getMessageCountPerpage() {
		return messageCountPerpage;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public int getEndRow() {
		return endRow;
	}
	
	
	
	
	

}
