package day03;


class A
{
	  public void prt()
	  {
		  System.out.println("A-prt");
	  }
	  public void view()
	  {
		  System.out.println("A-view");
	  }
}

class B extends A
{
	public void paint()
	{
		System.out.println("paint");
	}
	public void prt()
	{
	    System.out.println("B-prt");
	}
	
}
public class OverrideTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A ins=new A();
		ins.prt();
	     ins.view();
	     System.out.println("=======");
	     
	     B ins2=new B();
	     ins2.prt();
	     ins2.view();
	     ins2.paint();
	     
	     
	     System.out.println("=======");
	     A ins3=new B();   // 클래스 형변환 
	      ins3.view();
	      ins3.prt();
	     // ins3.paint();  에러
	    // B ins4=new A();  에러 
	     
	     
	     
	     
	     
	     
		
		
	}
}
