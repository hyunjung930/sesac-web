package day03;
/*
 * 
 * 
 * 
 * 
 */
class Super3
{
	private String name;
	
	public Super3(String name)
	{
		this.name=name;
	}
	
	public Super3()
	{
		
	}
}

class Sub3 extends Super3
{
	public Sub3(String name)
	{
		super(name);
	}
	
	public Sub3()
	{
		//super();
	}
}


public class SuperSubTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
