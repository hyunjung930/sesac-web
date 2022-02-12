package kr.co.mlec.lib.ui;

import java.util.Scanner;

public abstract class baseUI implements iLibUI {
	
	private Scanner sc;

	public baseUI() {
		sc = new Scanner(System.in);
	}

	public String scanStr(String msg) {

		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}

	public int scanInt(String msg) {
		System.out.print(msg);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

}
