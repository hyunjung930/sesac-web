package day03;

class P1
{
	public void prt(){
		System.out.println("p1-prt");
	}
	public void draw()
	{
		System.out.println("draw");
	}
	
}

class P2 extends P1
{
	
	public void view()
	{
		System.out.println("p2-view");
	}

	@Override
	public void prt() {
		// TODO Auto-generated method stub
		System.out.println("p2-prt");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         P1 ins=new P2();
         ins.prt();
         ins.draw();
    		
		System.out.println("======");
		
		
		//P2 ins2=(P2)new P1(); Exception 
		
		
		  P1 ins3=new P2();
		  P2 ins4=(P2)ins3;
		  
		  ins4.prt();
		  ins4.draw();
		  ins4.view();
		
		
		
		
		
	}
}
