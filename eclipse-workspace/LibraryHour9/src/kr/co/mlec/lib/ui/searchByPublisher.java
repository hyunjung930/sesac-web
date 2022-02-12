package kr.co.mlec.lib.ui;

import java.util.List;

import kr.co.mlec.lib.dao.searchBookDAO;
import kr.co.mlec.lib.vo.bookVO;

public class searchByPublisher extends searchBookUI {
	@Override
	public void execute() {
		String no = scanStr("○ 조회할 책의 출판사를 입력하세요: ");

		searchBookDAO dao = new searchBookDAO();
		List<bookVO> list = dao.selectByPublisher(no);

		//
		System.out.println(
				"============================ <   책          출         력     >==================================");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(" 책 번호\t\t  " + "제목 \t\t" + "저자\t\t" + "출판사\t\t" + "가격");
		System.out.println("------------------------------------------------------------------------------------");
		if (list.isEmpty()) {
			System.out.println("○ 조회된 책이 없습니다");
		} else {
			for (bookVO book : list) {
				System.out.printf("%3s\t%-18s\t%-10s\t%-10s\t%-20s\n", book.getBookNo(), book.getTitle(),
						book.getAuthor(), book.getPublisher(), book.getPrice());

			}

		}
		System.out.println("=====================================================================================");
}}