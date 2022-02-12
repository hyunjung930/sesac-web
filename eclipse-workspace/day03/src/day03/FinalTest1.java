package day03;

/*
 *    final 변수 :상수
 *    
 *     지역변수
 *     인스턴스변수(멤버변수)  : 
 *          직접적으로 초기화 하거나 생성자를 이용하여  초기화 
 *     
 *     클래스변수 
 *       
 *    
 *    
 *   =? final 메서드  : 오버라이딩 불가
 *   =? final 클래스  : 상속불가 
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
