package day01;

import java.util.Scanner;

/*
 *  �̸��� ���̸� �Է¹޾� ����ϴ� ���α׷�
 * 
 */
public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("�̸��� �Է��ϼ���");
	  String name=sc.nextLine();
	  
	  System.out.println("���̸� �Է��ϼ���");
	  int age=Integer.parseInt(sc.nextLine());
	  
	  System.out.println("�̸�:"+name);
      System.out.println("���� : "+age);		
		
		
	}

}
