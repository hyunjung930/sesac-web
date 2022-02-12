package day02;

import java.util.Scanner;

class Method3
{
	  String paint(String color)
	   {
		   
		   System.out.println("색상은 : "+color);
		     
		   return "페인팅이 완료되었습니다.";
	   }
	
}


public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		   Method3 ins=new Method3();
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("색상을 고르시오");
		   String c=sc.nextLine();
		   
	    String result=ins.paint(c);
		  System.out.println(result);
		
	}

}
