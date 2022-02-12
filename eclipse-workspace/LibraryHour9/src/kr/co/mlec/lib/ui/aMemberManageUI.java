package kr.co.mlec.lib.ui;

public class aMemberManageUI extends baseUI{

	@Override
	public void execute() {
		System.out.println("----------------------");

		System.out.println(" 회원관리 메뉴입니다.");
		System.out.println("1.전체 회원 확인");
		System.out.println("2.회원 목록 수정");
		System.out.println("3.회원 목록 삭제");

		System.out.println("----------------------");
		String type = scanStr("메뉴 중 처리할 항목을 선택하세요: ");
		iLibUI ui = null;
		switch (type) {
		case "1":
			ui = new aMemberAllUI();
			break;
		case "2":
			ui = new aMemberUpdateUI();
			break;
		case "3":
			ui = new aMemberDeleteUI();
			break;
			}
		if(ui != null) {
			ui.execute();
		}else {
			System.out.println("잘못입력하셨습니다. 다시 입력하세요 ");
		}
	}
}
