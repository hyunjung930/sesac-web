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
		
		System.out.println("�̸� : "+name);
		System.out.println("���� :"+kor);
		System.out.println("���� :"+math);
		System.out.println("���� :"+eng);
		System.out.println("���� : "+tot);
		System.out.println("��� :"+avg);
		
		
		
		
		
	}

}
