package kr.co.mlec.lib.ui;

import kr.co.mlec.lib.dao.aBookDAO;
import kr.co.mlec.lib.vo.bookVO;

public class aBookUpdateUI extends baseUI {
	@Override
	public void execute() {


		String book_n = scanStr("○ 책 번호를 입력하세요.");
		String title = scanStr("○ 책 제목을 입력하세요.");
		String author = scanStr("○ 저자를 입력하세요.");
		String publisher = scanStr("○ 출판사를 입력하세요.");
		String price = scanStr("○ 가격을 입력하세요.");
		
		aBookDAO aBookDao = new aBookDAO();
		bookVO book = new bookVO();

		book.setBookNo(book_n);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPrice(price);

		aBookDao.updateBook(book);

		System.out.println("○ 변경을 완료하였습니다");

	}
}