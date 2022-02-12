package day01;

import java.util.Scanner;

public class SungjuckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc=new Scanner(System.in);
		
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
		
		System.out.println("이름 : "+name);
		System.out.println("국어 :"+kor);
		System.out.println("수학 :"+math);
		System.out.println("영어 :"+eng);
		System.out.println("총점 : "+tot);
		System.out.println("평균 :"+avg);
		
		
		
		
		
	}

}
