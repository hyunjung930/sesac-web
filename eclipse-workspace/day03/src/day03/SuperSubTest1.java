package day03;

class Super1  //�θ�Ŭ����  superŬ����
{
	
	public void prt()
	{
		System.out.println("Super1-prt");
	}
	public void prt2()
	{
		System.out.println("Super1-prt2");
	}
	
}

class Sub1 extends Super1    //  Sub1 :  �ڽ�Ŭ����   subŬ���� =>   class �ڽ�Ŭ�����̸�   extends �θ�Ŭ����    
{
	
	public void draw()
	{
		System.out.println("Sub1-draw");
	}
	
}

public class SuperSubTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Super1 ins=new Super1();
             ins.prt();
             ins.prt2();
           
           System.out.println("=========");
           Sub1 ins2=new Sub1();
           
		   ins2.prt();
		   ins2.prt2();
           ins2.draw();
		   
	}
}
