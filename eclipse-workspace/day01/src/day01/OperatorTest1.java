package day01;

/*
 *   ������ 
 *   
 *   ���Ͽ�����
 *       ��ȣ������  + -
 *       ����������  ++
 *       ���ҿ�����      --
 *   
 *   
 *   ���׿�����
 *      ��Ģ������   +   -   *    /  %(������)
 *      �񱳿�����    >  >=  <  <=  ==(����)  !=(�����ʴ�)
 *      ������    &&(and)   ||(or)    !(not)
 *      ��Ʈ������
 *           &(and)   |(or)  ^(xor: exclusive or)  ~(not)
 *     
 *     ���Ῥ����  +
 *     
 *  ���׿����� (���ǿ���)
 *     (����)? ��: ����;
 *      
 */




public class OperatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int d1=10;
         
         int d2=-d1;  // +   -  
         System.out.println(d1);
         System.out.println(d2);
         
         //���������� 
         
         System.out.println("=================");
         
         int x=10;
         int y=++x;  //����������  x:11  y=11
         
         System.out.println(x);
         System.out.println(y);
         
         System.out.println("================");
         
         x=10;
         y=x++;  //����������    y=10   x=11
         
         System.out.println(x);
         System.out.println(y);
         
         
         System.out.println("===========test1   ==============");
         
         
          x=10;
          y=--x;
          
          System.out.println(x);
          System.out.println(y);
          
          System.out.println("================test  2  ======");
          x=10;
          y=x--;
          System.out.println(x);
          System.out.println(y);
         
         
         
         
         
         
	}

}
