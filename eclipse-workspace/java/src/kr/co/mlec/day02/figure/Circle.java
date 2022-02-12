package kr.co.mlec.day02.figure;

public class Circle implements Figure {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		double area = radius * radius * Math.PI;
		System.out.println("반지름 : " + radius + ", 원 넓이 : " + area);
	}
	
	
	
}
