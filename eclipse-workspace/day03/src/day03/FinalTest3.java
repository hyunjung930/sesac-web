package day03;
/*
 *  final 변수  : 상수
 *  final 메서드: 오버라이딩 불가 
 *  
 *  final 클래스 : 상속불가  종단클래스 
 * 
 */
final class Final1
{
	  public final void prt()
	  {
		  System.out.println("prt");
	  }
	
}

class Final2 extends Final1
{
	
	public void view()
	{
		System.out.println("view");
	}
	
	@Override  //어노테이션  annotation 
	public void prt()
	{
		 System.out.println("override prt");
	}
}


public class FinalTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Final1 ins=new Final2();
        ins.prt();
        
	}

}
