package day02;
/*
 *  ������ �����ε�( constructor overloading)
 *   => Ŭ���� ������  ������ �������� ���� �� �� ����
 *   
 *   ������ �̸��� ������ �Ű����� Ÿ��,����, ������ �ٸ��� 
 *   �ٸ� �����ڷ� �ν�
 * 
 * 
 */
class Man3
{
	String name;
	int age;
	
	Man3(String n, int a) //������
	{
		System.out.println("������-1");
	    name=n;
	    age=a;
	}
	
	Man3(int a, String n)
	{
		
	}
	
	Man3(String a, String b)
	{
		
	}
//	
//	Man3(String b, String a)
//	{
//		
//	}
//	
	Man3(String n)
	{
		System.out.println("������-�Ű����� String");
		name=n;
	}
	
	Man3(int a)
	{
		System.out.println("������-�Ű����� int");
		age=a;
	}
	
	
	public void prt()
	{
		System.out.println("name : "+name);
		System.out.println("age: "+age);
	}
	
}


public class ConstructorTest2 {
	public static void main(String[] args) {
	
		Man3 ins=new Man3("������",28);
		ins.prt();
		
		System.out.println("=============");
		Man3 ins2=new Man3("���ϳ�");
	     ins2.prt();	
		System.out.println("=============");
   		
		Man3 ins3=new Man3(20);
		ins3.prt();
		System.out.println("=============");
		
		
	}
}
