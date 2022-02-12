package day02;
/*
 *  생성자 오버로딩( constructor overloading)
 *   => 클래스 내에서  생성자 여러개를 정의 할 수 있음
 *   
 *   생성자 이름이 같으나 매개변수 타입,순서, 갯수가 다를때 
 *   다른 생성자로 인식
 * 
 * 
 */
class Man3
{
	String name;
	int age;
	
	Man3(String n, int a) //생성자
	{
		System.out.println("생성자-1");
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
		System.out.println("생성자-매개변수 String");
		name=n;
	}
	
	Man3(int a)
	{
		System.out.println("생성자-매개변수 int");
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
	
		Man3 ins=new Man3("최현정",28);
		ins.prt();
		
		System.out.println("=============");
		Man3 ins2=new Man3("김하나");
	     ins2.prt();	
		System.out.println("=============");
   		
		Man3 ins3=new Man3(20);
		ins3.prt();
		System.out.println("=============");
		
		
	}
}
