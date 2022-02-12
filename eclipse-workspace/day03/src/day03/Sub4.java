package day03;


public class Sub4 extends Super4
{
	 private int age;
	 private String addr;
	 
    public Sub4(String name, int age,String addr )
    {
    	 //super("홍길동");
    	super(name);
    	this.age=age;
    	this.addr=addr;
    	
    }
    public void print()
    {
    	super.prt();
    	System.out.println("나이 :"+age);
    	System.out.println("주소 :"+addr);
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
