package kr.co.mlec.day02.figure;

public class Triangle extends PlaneFigure {

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void printArea() {

		int width = getWidth();
		int height = getHeight();
		
		double area = width * height / 2;
		System.out.println("밑변 : " + width + " 높이 : " + height
							+ ", 삼각형의 넓이 : " +area );
		
	}

	
}
