package day03;
/*
 *   static ���� 
 *    : Ŭ�������� 
 *    ��ü �������ϰ� ����ϴ� ���� 
 *    Ŭ�����̸�.���� 
 *    
 *   static  �޼��� 
 *   : Ŭ�����޼��� 
 *    ��������,�Ű�����, Ŭ������������� ����  => �ν��Ͻ� ������ ����� �� ����
 *    
 *     
 *   Ŭ�����̸�.�޼���
 *   
 *  
 * 
 */
class Static1
{
	public int kor;  //�������  �ν��Ͻ� ����   ��ü�� ��������� kor�� �������
	public  static  int eng;  //Ŭ��������   Ŭ������ �о�����(�ε��ÿ�)
	
	
	public  static   void prt()  //Ŭ�����޼��� 
	{
		System.out.println("prt!!!");
	}
	
	
	public static void prt2(String addr) //addr : �޼��尡 ȣ��ɶ� 
	{
		 String name="����";
		 System.out.println(name);
		 System.out.println(eng);
		// System.out.println(kor);
	}
	
	
	
//	public void prt()
//	{
//		static int su=10;
//	}
}
public class StaticTest1 {
	public static void main(String[] args) {

		   Static1.prt();
		   Static1.prt2("hong");
		
		  Static1 ins=new Static1();
		  Static1 ins2=new Static1();
		  
		  
		  ins.kor=100;
		  ins2.kor=200;
		  
		  
		  ins.eng=100;
		  ins2.eng=200;
		  
		  
		 System.out.println(ins.kor);
		 System.out.println(ins2.kor);
		 
		// System.out.println(Static1.kor);
		 System.out.println("========");
		 System.out.println(ins.eng);
		 System.out.println(ins2.eng);
		 System.out.println(Static1.eng);
		
		
		
	}
}
