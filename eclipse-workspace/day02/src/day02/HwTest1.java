package day02;

import java.util.Scanner;

public class HwTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  scanner=new Scanner(System.in);
       
       System.out.println("input name");
       String name=scanner.nextLine();
       
       System.out.println("input kor");
        int kor=Integer.parseInt(scanner.nextLine());
        
		
		System.out.println("input eng");
		 int eng=Integer.parseInt(scanner.nextLine());
		 
		 System.out.println("input math");
		 int math=Integer.parseInt(scanner.nextLine());
		 
		 int tot=kor+eng+math;
		 float avg=tot/3.0f;
		 
		 String result="";
		 if(avg>=90)
			    result="수";
		 else if(avg>=80)
			    result="우";
		 else if(avg>=70)
			 result="미";
		 else if(avg>=60)
			 result="양";
		 else
			  result="가";
		 
		  //  이름:문자  %s   국어  영어 수학 :정수형 숫자   %d      평균 :실수  %f
		 System.out.println("이름 \t 국어 \t  영어\t 수학\t  총점\t 평균 성취도 ");
		 System.out.printf("%s\t  %d\t %d\t %d\t  %d\t  %.2f %s \n", name, kor, eng, math, tot,avg, result); 
		 
		 System.out.println("=========");

		 /*
		  *   switch   case
		  *   
		  *   switch() 변수/식   int   byte  short   char   String   enum
		  *   {
		  *      case   100   99  98   97  96... 91  90  수  
		  *                89  88  87   86.... 80  우
 	  *   
		  *   
		  *   
		  *   }
		  *     avg/10   => float/int  =>  float 
		  * 
		  */
		 
		 String result2="";
		 switch ((int)(avg/10))  
		 {
		 case 10:
		 case 9:
			 result2="수";
			 break;
	    case 8:
	    	result2="우";
			 break;
		 
	    case 7:
	    	 result2="미";
            break;
	    case 6:
	    	 result2="양";
	    	 break;
	    default:
	    	 result2="가";
		 
		 }
		 
		 System.out.println("성취도2 : "+result2);
		 
		 
		 
		
	}

}
