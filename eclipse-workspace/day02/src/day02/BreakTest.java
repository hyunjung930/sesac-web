package day02;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //
		  Scanner sc=new Scanner(System.in);
		    for(;;)
		    { 
	        System.out.println("안녕하세요 ?");
	         String yn=sc.nextLine();
	         
	         if(yn.equals("n")) {
	              break;
		    	
		          }   //if
		
	       }  //for

   }  //main
}  // class
