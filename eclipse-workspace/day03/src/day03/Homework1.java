package day03;

import java.util.Scanner;
public class Homework1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("input inwon");
	int inwon=Integer.parseInt(sc.nextLine());
	String[] name=new String[inwon];
	int[] kor=new int[inwon];
	int[] eng=new int[inwon];
	
	int[] tot=new int[inwon];
	int[] avg=new float[inwon];
	
	for(int i=0; i<inwon; i++)
	{
		System.out.println("input name");
		name[i]=sc.nextLine();
		System.out.println("input kor");
		kor[i]=Integer.parseInt(sc.nextLine());
		System.out.println("input eng");
		eng[i]=Integer.parseInt(sc.nextLine());
		
		tot[i]=kor[i]+eng[i];
		avg[i]=tot[i]/2.0f;
		
	}
	//출력
System.out.println(이름\t 국어\t 영어\t 총점\t 평균 );
for(int i=0; i<inwon; i++)
{
	System.out.println("%s\t %d\t %d\t %d\t %.2f\n", name[i], );
}
	
	
	
}
}
