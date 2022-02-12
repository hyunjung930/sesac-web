package kr.co.mlec.day02.figure;

import java.util.Random;
import java.util.Scanner;

public class FigureView {

	private int getRandom() {
		Random r = new Random();
		return r.nextInt(8) + 2;
	}
	
	public void start() {

		Scanner sc = new Scanner(System.in);

		System.out.print("도형을 선택하세요(1.직사각형 2.정사각형 3.삼각형 4.원) : ");
		int command = sc.nextInt();

		Figure fig = null;
		switch (command) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			fig = new Triangle(getRandom(), getRandom());
			break;
		case 4:
			fig = new Circle(getRandom());
			break;
		}
		
		if(fig != null)
			fig.printArea();

	}
}
