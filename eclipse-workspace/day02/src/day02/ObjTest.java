package day02;

  class Person
  {
	   String name;
	   int age;
	   String addr;
	  
  }
/*
 *    int[] arr=new int[3];
 *    
 * 
 *     byte  short  int  long float double
 *         char
 *         
 *         boolean 
 *         
 * 
 */

public class ObjTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Person p1=new Person();
		     p1.name="ȫ�浿";
		      p1.age=20;
		      p1.addr="����";
		     
		   
		   Person p2=new Person();
		     p2.name="���ϳ�";
		     p2.age=10;
		     p2.addr="���";
		     
		
		  System.out.println(p1.name);
		  System.out.println(p1.age);
		  System.out.println(p1.addr);
		  
		  
		  System.out.println("=======");
		  System.out.println(p2.name);
		  System.out.println(p2.age);
		  System.out.println(p2.addr);
		
		
	}

}
