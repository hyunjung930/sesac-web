package day03;


public class Sub4 extends Super4
{
	 private int age;
	 private String addr;
	 
    public Sub4(String name, int age,String addr )
    {
    	 //super("ȫ�浿");
    	super(name);
    	this.age=age;
    	this.addr=addr;
    	
    }
    public void print()
    {
    	super.prt();
    	System.out.println("���� :"+age);
    	System.out.println("�ּ� :"+addr);
    }
    
    
    public void test()
    {
    	this.test2();
    	System.out.println("test1");
    }
    public void test2()
    {
    	System.out.println("test2");
    }
}
