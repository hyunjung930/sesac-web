package kr.co.mlec.lib.ui;


public class exitUI extends baseUI{
	@Override
	public void execute() {
		System.out.println("---------------------------");
		System.out.println("\n\t프로그램을 종료합니다\n");
		System.out.println("---------------------------");
		System.exit(0);
	}
}
