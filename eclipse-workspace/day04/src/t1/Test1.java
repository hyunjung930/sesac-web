package t1;
class A
{
	public void prt() {System.out.println("A");}
	}
class B extends A
{
	public void prt() {System.out.println("B");}
}
class C extends A
{
	public void prt() {System.out.println("C");}

}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A ins=new A();
		ins.prt();
		ins=new B();
		ins.prt();
		ins=new C();
		ins.prt();
		
	}

}
