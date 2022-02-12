
package kr.co.mlec.lib.ui;

import java.util.List;

import kr.co.mlec.lib.dao.searchBookDAO;
import kr.co.mlec.lib.vo.bookVO;

public class searchByAllUI extends searchBookUI {

	@Override
	public void execute() {
		
		searchBookDAO dao = new searchBookDAO();
		List<bookVO> list = dao.selectByAll();

		System.out.println("============================ <   책          출         력     >==================================");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(" 책번호\t\t  " + "제목 \t\t" + "저자\t\t" + "출판사\t\t" + "가격");
		System.out.println("---------------------------------------------------------------------------------");
		for(bookVO book : list) {
			System.out.printf("%3s\t%-18s\t%-12s\t%-10s\t%-10s\n",
					book.getBookNo(),  
					book.getTitle(),
					book.getAuthor(),
					book.getPublisher(),
					book.getPrice()
					);
			
		}
		
		System.out.println("=====================================================================================");
}

}
