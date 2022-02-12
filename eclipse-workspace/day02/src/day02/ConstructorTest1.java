package day02;
/*
 * 
 *   ������(Constructor)
 *     => ��ü�� ��������� �ν��Ͻ� �ʱ�ȭ
 *     => ��ü�� ��������� �ؾ��� �ϵ��� ���
 *     
 *    ����� ���
 *     Ŭ�����̸��� ���� �޼��� ��� (�� ����Ÿ��x)
 *   
 *   ������ ȣ�����
 *      new �Ҷ� �ڵ����� ȣ��(��ü�� ��������� �ڵ�ȣ��)
 */
class Man1
{
	
	 String name;   //�������  �ν��Ͻ� ���� 
	 int age;
	
    void print()  //�޼��� 
	{
		System.out.println(name);
		System.out.println(age);
	}
    
    Man1(String n, int a)  //������ 
    {
    	name=n;
    	age=a;
    }
}

public class ConstructorTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int su = 10;
//
//		int su2;
//		su2 = 200;
//
//		int[] arr = new int[3];
//		arr[0] = 100;
//		arr[1] = 200;
//		arr[2] = 300;
//
//		int[] arr2 = { 100, 200, 300 }; 
//		Man1 ins=new Man1();
//		
//		ins.name="honggildong";
//		ins.age=10;
//		
		Man1 ins=new Man1("honggildong",20);
		System.out.println(ins.name);
		System.out.println(ins.age);
		
	}
}
