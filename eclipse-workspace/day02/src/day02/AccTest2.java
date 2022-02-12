package day02;
/*
 *   ���ռ�  : ���ߵ���
 *   ������  : ���ƾ� ����
 */
class Dog
{
	private String name;
    private  int age;
    /*
     *   name�� �����ϴ� �޼��� 
     *      setName 
     */
     public  void setName(String name)
        {
        	this.name=name;
        }
    /*
     *  name���� ������ �޼��� 
     * 
     */
       public  String   getName()
       {
    	   return name;
       }
       public void   setAge(int age)
       {
    	     this.age=age;
       }
       public int getAge()
       {
    	   return age;
       }
     
     public Dog(String name, int age)  //������ 
    {
          this.name=name;
          this.age=age;
     }
	
    public Dog(String name) //������
    {
    	this.name=name;
    }
    public Dog(int age)  //������
    {
    	this.age=age;
    }
	
    public void prt() //��±�� :  �޼���
    {
          System.out.println("�̸� :"+name);
         System.out.println("���� : "+age);
    }
     
}
public class AccTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog ins=new Dog("����",4);
        //  System.out.println(ins.name);
	    ins.prt();
	}
}
