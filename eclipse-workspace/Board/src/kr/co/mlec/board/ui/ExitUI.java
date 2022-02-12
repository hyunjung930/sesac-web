package kr.co.mlec.board.ui;

public class ExitUI extends BaseUI {

	@Override
	public void execute() {		// IBoardUI의 execute 메소드를 상속 받은 추상클래스 baseUI를 오버라이딩 하여 프로그램 종료.
		System.out.println("---------------------------");
		System.out.println("\n\t프로그램을 종료합니다\n");
		System.out.println("---------------------------");
		System.exit(0);
	}

}
