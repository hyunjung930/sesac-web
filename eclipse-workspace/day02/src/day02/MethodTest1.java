package day02;

/*
 *   Ŭ����   : 
 *      �� => ����   
 *      ���� =>  �Լ� (�޼��� method)
 *   
 *   ��ü:  ��,  ����   
 *   
 *     ȫ�浿
 *     ����
 *     �ּ�
 *     eat
 *     walk
 *     study 
 */


class Person4
{
	
	   void paint()
	    {
	    	System.out.println("����Ʈ�� ĥ�մϴ�.");
	    	System.out.println("������ ������Դϴ�.");
	    	
	    }
	
	   int prt()
	   {
		   System.out.println("print1");
		   System.out.println("print2");
		   
		   return 10;  // return ��; 
	   }
	   
	   
}

public class MethodTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person4 ins=new Person4();
          int su1= ins.prt();  //�޼��� ȣ��
         
           System.out.println("=======");
         Person4 ins2=new Person4();
            int su2=  ins2.prt();
		   System.out.println(su1);
		   System.out.println(su2);
		   
		   System.out.println("========");
		   
		   
		   ins.paint();
		   ins2.paint();
		   
		   
		   
		
	}
}
