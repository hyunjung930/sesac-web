package kr.co.mlec.board.ui;

public class BoardUI extends BaseUI {
	// BaseUI 상속 받아 게시판 클래스 보여
	private String menu() {		//게시글 조회를 위한 내용출력
		System.out.println("------------------------------");
		System.out.println("\t1. 전체게시글 조회");
		System.out.println("\t2. 글번호 조회");
		System.out.println("\t3. 글 등록");
		System.out.println("\t4. 글 수정");
		System.out.println("\t5. 글 삭제");
		System.out.println("\t0. 종료");
		System.out.println("------------------------------");
		
		String type = scanStr("메뉴 중 처리할 항목을 선택하세요 : ");
		
		return type;	//type 리턴 
	}

	@Override
	public void execute() {
		
		while (true) {		
			// 게시판 번호 대로 시행 후 back to 
			//게시판 메뉴로 돌아가게 해줘야해서 while문 사용
			
			IBoardUI ui = null;
			String type = menu();

			switch (type) {
			case "1":
				ui = new SearchUI();
				break;
			case "2":
				ui = new SearchOneUI();
				break;
			case "3":
				ui = new AddUI();
				break;
			case "4":
				ui = new UpdateUI();
				break;
			case "5":
				ui = new DeleteUI();
				break;
			case "0":
				ui = new ExitUI();
				break;
			}
			
			if(ui != null) {		//default 값으로는 안되는지?
				ui.execute();
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}



















