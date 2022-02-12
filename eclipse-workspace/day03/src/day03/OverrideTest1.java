package day03;
/*
 *   메서드  오버라이딩(method overriding):  재정의 
 *   상속관계에서 부모에서 정의한 메서드를 자식 클래스에서 다시 정의 
 *   
 *      메서드 이름이 같아야 매개변수   타입,순서, 갯수가 다 같아야 
 *      리턴타입도 같아야 
 *      
 *      접근지정자 __________________________
 *      예외처리 관점 _______________________________
 * 
 * 
 * 
 */
class OverrideSuper1
{
	public void print()
	{
		System.out.println("OverrideSuper1-print");
	}
	
}

class OverrideSub1 extends OverrideSuper1
{
	
	public void draw()
	{
		System.out.println("OverrideSub1-draw");
	}
	
	public void print()
	{
		System.out.println("hello");
	}
}

public class OverrideTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideSuper1 ins=new OverrideSuper1();
	     ins.print();
	   System.out.println("=================");

	   OverrideSub1 ins2=new OverrideSub1();
      ins2.print();
      ins2.draw();
      
      
      
		
	}

}
