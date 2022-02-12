package day01;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("input name");
		String name=sc.nextLine();
		
		System.out.println("input kor");
		int kor=Integer.parseInt(sc.nextLine());
		
		System.out.println("input eng");
		int eng=Integer.parseInt(sc.nextLine());
		
		System.out.println("input math");
		int math=Integer.parseInt(sc.nextLine());

		int tot=kor+eng+math;
		float avg=(float)tot/3;
		
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);
		System.out.println("성취도: ");
		if(avg>=90)
			System.out.println("수");
		else if(avg>=80)
			System.out.println("우");
		else if(avg>=70)
			System.out.println("미");
		else if(avg>=60)
			System.out.println("양");
		else
			System.out.println("가");
	}

}
