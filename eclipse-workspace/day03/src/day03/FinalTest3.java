package day03;
/*
 *  final ����  : ���
 *  final �޼���: �������̵� �Ұ� 
 *  
 *  final Ŭ���� : ��ӺҰ�  ����Ŭ���� 
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
	
	@Override  //������̼�  annotation 
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
