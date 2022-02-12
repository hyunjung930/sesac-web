package day02;

import java.util.Scanner;

public class HwTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       System.out.println("input su");
       
       
       int su=Integer.parseInt(sc.nextLine());
       
       if(su>9 || su<2)
    	   System.out.println("입력오류");
       else
       {
    	    for(int i=1; i<=9; i++)
    	    {
    	    	System.out.printf("%d * %d = %d \n", su, i, su*i );
    	    }
    	   
       }
       
       
		
		
		
		
	}

}
