package day03;
/*
 *   �޼���  �������̵�(method overriding):  ������ 
 *   ��Ӱ��迡�� �θ𿡼� ������ �޼��带 �ڽ� Ŭ�������� �ٽ� ���� 
 *   
 *      �޼��� �̸��� ���ƾ� �Ű�����   Ÿ��,����, ������ �� ���ƾ� 
 *      ����Ÿ�Ե� ���ƾ� 
 *      
 *      ���������� __________________________
 *      ����ó�� ���� _______________________________
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
