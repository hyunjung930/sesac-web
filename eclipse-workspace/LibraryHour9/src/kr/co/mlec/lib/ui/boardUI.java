package kr.co.mlec.lib.ui;



public class boardUI extends baseUI {

	private String menu() {
		
		System.out.println("------------------------------");
		System.out.println("\t1. 도서검색");
		System.out.println("\t2. 회원등록");
		System.out.println("\t3. 대출");
		System.out.println("\t4. 반납");
		System.out.println("\t5. 관리자 모드");		
		System.out.println("\t0. 종료");
		System.out.println("------------------------------");
		
		String type = scanStr("○ 메뉴 중 처리할 항목을 선택하세요 : ");
		
		return type;
	}
	@Override
	public void execute() {
		
	while (true) {
			
			iLibUI ui = null;
			String type = menu();

			switch (type) {
			case "1":
				ui = new searchBookUI();
				break;
			case "2":
				ui = new addMemberUI();
				break;
			case "3":
				ui = new checkInUI();
				break;
			case "4":
				ui = new checkOutUI();
				break;			
			case "5":
				ui = new managerUI();
				break;
			case "0":
				ui = new exitUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("○ 잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}

	//1. 도서검색
	//2. 회원등록
	//3. 대출
	//4. 반납
	//0. 종료
