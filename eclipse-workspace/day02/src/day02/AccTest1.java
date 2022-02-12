package day02;

/*  ����������   ���������� 
 * 
 *   public    : ��ü���� 
 *   protected
 *   default
 *   private  : Ŭ������������ ����
 */
class Person7
{
	  public String name="a";
	  int age=20;
	  public void prt()
	  {
		   System.out.println(name);  
		   System.out.println(age);
	  }
}
public class AccTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person7 ins=new Person7();
       
       ins.name="홍길동 ";
       ins.age=20;
       
       System.out.println(ins.name);
       System.out.println(ins.age);
		
		
		
	}
}
