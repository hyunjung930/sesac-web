package day03;

/*
 *    final ���� :���
 *    
 *     ��������
 *     �ν��Ͻ�����(�������)  : 
 *          ���������� �ʱ�ȭ �ϰų� �����ڸ� �̿��Ͽ�  �ʱ�ȭ 
 *     
 *     Ŭ�������� 
 *       
 *    
 *    
 *   =? final �޼���  : �������̵� �Ұ�
 *   =? final Ŭ����  : ��ӺҰ� 
 * 
 */

class Sample
{
	public final int su=30;
	
	public final int su2;
	
	public static int su3=10;
	
	public static int[] arr;
	
	static {
		
		arr=new int[3];
		for(int i=0; i<arr.length; i++)
		{
			arr[0]=i*10;
		}
		
	}
	
	public Sample(int su2)
	{
		this.su2=su2;
	}
	
	
	
	
	
}



public class FinalTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//            final int su=10;
//            su=40;
            
//            Sample ins=new Sample();
//             System.out.println(ins.su);
//             ins.su=40;
            
	}
}
