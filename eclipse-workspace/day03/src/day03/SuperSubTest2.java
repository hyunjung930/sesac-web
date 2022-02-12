package day03;

class Super2
{
	public Super2()
	{
		System.out.println("Super class-constructor");
	}
	
	
}

class Sub2 extends Super2
{
	
	private String name;
	
    public Sub2()
	{
		super();
		System.out.println("Sub2 class-constructor");
	}
}

public class SuperSubTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Super2 ins=new Super2();
		   System.out.println("=======");
		   Sub2 ins2=new Sub2();
		   
		
		
	}
}
