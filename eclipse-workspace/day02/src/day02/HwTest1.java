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
			    result="��";
		 else if(avg>=80)
			    result="��";
		 else if(avg>=70)
			 result="��";
		 else if(avg>=60)
			 result="��";
		 else
			  result="��";
		 
		  //  �̸�:����  %s   ����  ���� ���� :������ ����   %d      ��� :�Ǽ�  %f
		 System.out.println("�̸� \t ���� \t  ����\t ����\t  ����\t ��� ���뵵 ");
		 System.out.printf("%s\t  %d\t %d\t %d\t  %d\t  %.2f %s \n", name, kor, eng, math, tot,avg, result); 
		 
		 System.out.println("=========");

		 /*
		  *   switch   case
		  *   
		  *   switch() ����/��   int   byte  short   char   String   enum
		  *   {
		  *      case   100   99  98   97  96... 91  90  ��  
		  *                89  88  87   86.... 80  ��
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
			 result2="��";
			 break;
	    case 8:
	    	result2="��";
			 break;
		 
	    case 7:
	    	 result2="��";
            break;
	    case 6:
	    	 result2="��";
	    	 break;
	    default:
	    	 result2="��";
		 
		 }
		 
		 System.out.println("���뵵2 : "+result2);
		 
		 
		 
		
	}

}
