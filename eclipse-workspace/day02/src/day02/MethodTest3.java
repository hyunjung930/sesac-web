package day02;

import java.util.Scanner;

class Method3
{
	  String paint(String color)
	   {
		   
		   System.out.println("������ : "+color);
		     
		   return "�������� �Ϸ�Ǿ����ϴ�.";
	   }
	
}


public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		   Method3 ins=new Method3();
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("������ ���ÿ�");
		   String c=sc.nextLine();
		   
	    String result=ins.paint(c);
		  System.out.println(result);
		
	}

}
