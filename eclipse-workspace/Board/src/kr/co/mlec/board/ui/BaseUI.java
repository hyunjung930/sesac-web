package kr.co.mlec.board.ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI {	
	//IBoardUI 인터페이스 할당 받아 + BaseUI를 추상 클래스로 만들어 다중상속받

	private Scanner sc;
	// private은 다른 클래스와 헷갈림 방지~

	public BaseUI() {
		sc = new Scanner(System.in);		// 입력받는 창을 만들어줌  
	}
	
	public String scanStr(String msg) {		//scanStr: 입력받을 때 BoardUI에서 Stirng로 받음  
		
		System.out.print(msg);
		String str = sc.nextLine();		//그 다음 줄에 입력 받음 
		return str;		//str로 결과 리턴 
	}
	
	public int scanInt(String msg) {	//scaInt: 입력받을 때 SearchOneUI에서 int로 받음
		System.out.print(msg);
		int num = Integer.parseInt(sc.nextLine());		//문자열 String타입의 숫자를 int타입으로 변환해줌 
		return num;
	}
}









