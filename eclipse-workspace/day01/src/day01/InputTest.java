package day01;

import java.util.Scanner;

/*
 *  이름과 나이를 입력받아 출력하는 프로그램
 * 
 */
public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("이름을 입력하세요");
	  String name=sc.nextLine();
	  
	  System.out.println("나이를 입력하세요");
	  int age=Integer.parseInt(sc.nextLine());
	  
	  System.out.println("이름:"+name);
      System.out.println("나이 : "+age);		
		
		
	}

}
