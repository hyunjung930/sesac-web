package day01;
/*
 * �������� 
 * 
 *   &&(and):�׸���   : ��ΰ� true�϶��� true
 *    ||( or) : �Ǵ�  : ������ ���� ��ΰ� false�϶� false
 *    
 *    !(not) ~�ƴϴ�  true-> false     false->true
 *    
 *    ^(XOR) : exclusive-or(��Ÿ�� or) 
 *        true, true=> false
 *        true, false=>true
 *         false, true=>true
 *        false, false=> false
 *    
 */
public class OperatorTests5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 boolean result1=10>=15;  //false
		 boolean result2=10==10;  //true
		 
		 System.out.println(result1&& result2);  //false
		 System.out.println(result1||result2);  //true
		  System.out.println(result1^result2);  //true
		 System.out.println(!result1);   //true
		
	}

}
