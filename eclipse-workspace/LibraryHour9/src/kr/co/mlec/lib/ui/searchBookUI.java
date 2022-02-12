package kr.co.mlec.lib.ui;

public class searchBookUI extends baseUI {

	// 도서검색
	@Override
	public void execute() {

		// 서치 유아이에서 메뉴를 선택
		// 책번호, 책 제목, 저자, 출판사,

		System.out.println("------------------------------");
		System.out.println("어떤 방법으로 책을 찾겠습니까?");
		System.out.println(" 0. 모든 도서 보기  ");
		System.out.println(" 1. 책 번호로 책 찾기  ");
		System.out.println(" 2. 책 제목으로 책 찾기  ");
		System.out.println(" 3. 저자로 책 찾기 ");
		System.out.println(" 4. 출판사로 책 찾기");
		System.out.println("------------------------------");

		String type = scanStr("○ 메뉴 중 처리할 항목을 선택하세요: ");
		iLibUI ui = null;
		switch (type) {
		case "0":
			ui = new searchByAllUI();
			break;
		case "1":
			ui = new searchByNo();
			break;
		case "2":
			ui = new searchByTitle();
			break;
		case "3":
			ui = new searchByAuthor();
			break;
		case "4":
			ui = new searchByPublisher();
			break;
		}
		if (ui != null) {
			ui.execute();
		} else {
			System.out.println("○ 잘못입력하셨습니다. 다시 입력하세요 ");
		}

		}

}
