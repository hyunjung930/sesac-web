package day02;

import java.util.Scanner;

public class ArrTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		   Scanner sc=new Scanner(System.in);
		
		      int[] arr=new int[4];
		
		      for(int i=0; i<arr.length; i++)
		      {
		    	  System.out.println("숫자를 입력하세요");
		    	   arr[i]=Integer.parseInt(sc.nextLine());
		      }
		    	  
		      
		      for(int i=0; i<arr.length; i++)
		    	  System.out.println(arr[i]);
		      
		      
		      /*
		       * 
		       *    su= Integer.parseInt(sc.nextLine())
		       *   arr[0]=10;
		       *    arr[1]=20;
		       *    
		       *    
		       *    
		       *    
		       * 
		       */
		      
		      
		      
		
		
	}
	
	

}
