package day01;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		  //10부터   15까지 출력하시오.
			
		for(int i=10   ; i <= 15; i++  )
		{
			  System.out.println(i);
			
		}
	   System.out.println("====================");
		
		//6부터 3까지 출력하시오.
		
		for(int i=6;  i>=3; i--)
		{
			
			System.out.println(i);
		}
		
		
		/*
		 *   숫자1, 숫자2를 입력하여  숫자1에서 부터 숫자2까지 출력하시오. (숫자1 보다 숫자2가 크다고 가정)
		 *    
		 *     2   
		 *     5
		 *     
		 *     2 3 4 5
		 *    
		 *    23분까지... 
		 * 
		 */
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("input su1");
//		int su1=Integer.parseInt(sc.nextLine());
//		
//		System.out.println("input su2");
//	     int su2=Integer.parseInt(sc.nextLine());	
//		
//		
//		for(int i=su1; i<=su2  ; i++)
//		{
//			System.out.println(i);
//			
//		}
		
		System.out.println("============");
		
		//  1 3 5 7 9 
		
//		 for(int i=1;  i<10; i++)
//		 {
//			 if(i%2==1)
//				  System.out.println(i);
//		 }
		
		
//		for(int i=1; i<10; i+=2)  // i=i+2
//		   System.out.println(i);
//		
		
		
		//        20   18   16   14    12    10  출력    38분까지 
		
		
	   for(int i=20   ; i >=10; i-=2)
	   {
		     System.out.println(i);
	   }
		
		
		
		
		
		
		
	}

}
