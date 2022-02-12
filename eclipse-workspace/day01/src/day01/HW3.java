package day01;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name=sc.nextLine();
					
		System.out.println("국어 점수를 입력하세요.");
		int kor=Integer.parseInt(sc.nextLine());
					
		System.out.println("영어 점수를 입력하세요.");
		int eng=Integer.parseInt(sc.nextLine());
					
		System.out.println("수학 점수를 입력하세요.");
		int math=Integer.parseInt(sc.nextLine());
					
		int tot=kor+eng+math;
					
		float avg=(float)tot/3;
					
		System.out.println("이름"+name);
		System.out.println("국어"+kor);
		System.out.println("영어"+eng);
		System.out.println("수학"+math);
		System.out.println("총점"+tot);
		System.out.println("평균"+avg);

		 int t=tot/3;
					 
		System.out.println("성취도");
		switch(t/10)
			{
			case 10:
				System.out.println("수");
				break;
			case 9:
				System.out.println("우");
				break;
			case 8:
				System.out.println("미");
				break;
			case 7:
				System.out.println("양");
				break;
			default:
				System.out.println("가");
			}		 			 
		}
	}

