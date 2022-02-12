package day02;

import java.util.Scanner;

public class HwTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("input jumsu1");
        int jumsu1=Integer.parseInt(sc.nextLine());
        
        System.out.println("input jumsu2");
        int jumsu2=Integer.parseInt(sc.nextLine());
        
        System.out.println("input jumsu3");
        int jumsu3=Integer.parseInt(sc.nextLine());
        
        if(jumsu1>=90 && jumsu2>=90 && jumsu3>=90)
        	System.out.println("very good");
        else if(jumsu1>=90 || jumsu2>=90 || jumsu3>=90)
        	System.out.println("good");
        else
        	 System.out.println("bad");
		
		
	}

}
