package day01;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println("input kor");
		int kor=Integer.parseInt(sc.nextLine());
		
		System.out.println("input eng");
		int eng=Integer.parseInt(sc.nextLine());
		
		System.out.println("input math");
		int math=Integer.parseInt(sc.nextLine());
		
		if (kor>=90&&eng>=90&&math>= 90)
		System.out.println("very good");
		else if(kor>=90 || eng>=90 || math>=90)
		System.out.println("good");
		else
		System.out.println("bad");
	}

}
