package kr.co.mlec.lib.ui;

import kr.co.mlec.lib.dao.libDAO;
//import kr.co.mlec.lib.dao.memberDAO;
import kr.co.mlec.lib.dao.bCheck2DAO;
import kr.co.mlec.lib.dao.bRentCheckDAO;
import kr.co.mlec.lib.dao.mManagerCheckDAO;
import kr.co.mlec.lib.dao.pManagerCheckDAO;
import kr.co.mlec.lib.dao.titleDAO;
import kr.co.mlec.lib.vo.rentalVO;

public class checkInUI extends baseUI {

	@Override
	public void execute() {
		// memberDAO memberDao = new memberDAO();
		libDAO dao4 = new libDAO();
		mManagerCheckDAO idcheck = new mManagerCheckDAO();
		pManagerCheckDAO passcheck = new pManagerCheckDAO();
		bRentCheckDAO bookcheck = new bRentCheckDAO();
		bCheck2DAO bookcheck2 = new bCheck2DAO();

		// 아이디 제대로 입력했는지

		String id = "";
		while (true) {
			id = scanStr("○ 회원 아이디를 입력하세요 : ");
			String w = idcheck.mcheck(id);

			if (!id.equals(w)) {
				System.out.println("○ 회원 아이디를 잘못 입력했습니다");
			} else {
				break;
			}
		}

		// 패스워드 제대로 입력했는지
		String password = "";

		while (true) {
			password = scanStr("○ 회원 패스워드를 입력하세요 : ");
			String o = passcheck.pcheck(id);

			if (!password.equals(o)) {
				System.out.println("○ 패스워드를 잘못 입력했습니다");
			} else {
				break;
			}
		}

		// 이미 대출된 책인지 아닌지
		String bookNo = "";
		while (true) {
			bookNo = scanStr("○ 대출할 도서 번호를 입력하세요 : ");
			String p = bookcheck.bookNocheck(bookNo);
			String p2 = bookcheck2.bookNocheck(bookNo);

			if (p2 == null) {
				System.out.println("○ 보유한 도서가 아닙니다. 책번호 오류.");
			} else if (bookNo.equals(p)) {
				System.out.println("○ 이미 대출된 책입니다. 책번호 오류.");
			} else {

				rentalVO aa = dao4.checkininfo(bookNo, id);
				titleDAO booktitleonly = new titleDAO();
				String t = booktitleonly.titleByNo(bookNo);

				System.out.println("----------------------------------------------------");
				System.out.println("○ 대출이 완료되었습니다.");
				System.out.println("○ 책 제목 : " + t);
				System.out.println("○ 책 번호 : " + aa.getBookNo());
				System.out.println("○ 회원 아이디 : " + aa.getId());
				System.out.println("○ 대출일 : " + aa.getInNo());
				System.out.println("○ 반납일 : " + aa.getOutNo());
				System.out.println("○ 반납일을 지켜주세요.");
				System.out.println("----------------------------------------------------");
				break;
			}
		}

	}
}