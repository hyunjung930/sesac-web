package kr.co.mlec.board.vo;

/*
 	1. 디폴트생성자 source-generate superclass
 	2. 매개변수 생성자 source-generate usingfield
 	3. getter/setter 메소드
 	4. toString 메소드
 */

public class BoardVO {	
	// DB에 실제로 값을 넣는 value object

	private int 	no;
	private String 	title;
	private String 	writer;
	private String 	regDate;
	
	public BoardVO() {
	}

	//디폴트 생성자 
	public BoardVO(int no, String title, String writer, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
	}
	//getter setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	//toString
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate + "]";
	}
	
}






