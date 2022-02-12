package day03;
/*
 *   static 변수 
 *    : 클래스변수 
 *    객체 생성안하고 사용하는 변수 
 *    클래스이름.변수 
 *    
 *   static  메서드 
 *   : 클래스메서드 
 *    지역변수,매개변수, 클래스변수사용이 가능  => 인스턴스 변수는 사용할 수 없음
 *    
 *     
 *   클래스이름.메서드
 *   
 *  
 * 
 */
class Static1
{
	public int kor;  //멤버변수  인스턴스 변수   객체가 만들어질때 kor가 만들어짐
	public  static  int eng;  //클래스변수   클래스가 읽어질때(로딩시에)
	
	
	public  static   void prt()  //클래스메서드 
	{
		System.out.println("prt!!!");
	}
	
	
	public static void prt2(String addr) //addr : 메서드가 호출될때 
	{
		 String name="하하";
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
