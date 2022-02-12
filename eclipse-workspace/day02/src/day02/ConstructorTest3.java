package day02;
/*
 *  생성자 ; 객체를 만드는 꼴(모양)
 * 
 *   기본생성자 :default생성자
 *     생성자이름(){}
 * 
 * 
 */

class Person5
{
	 String name;
	 int age;
	 
//	  Person5(String n, int a)
//	    {
//	    	System.out.println("생성자 ");
//	    }
//	    
//   개발자가 만들지 않은 생성자 : default생성자 	  
//	 Person5()
//	  {
//		  System.out.println("생성자-매개변수가 없는");
//	  }
//	
	Person5(String n)
	{
		
	}

	Person5()
	{
		
	}
	 
}


public class ConstructorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Person5 ins=new Person5();
		
		
		
	}

}
