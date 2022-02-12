package day01;

/*
 *  조건연산자
 * 
 * 
 */
public class OperatorTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
//		String  name="홍길동";
//		char ch='a';
//
//		
//		 System.out.println(name);
//		 System.out.println(ch);
//		
//		 int su=-10;
//		 String result=(su>=0)? "양수":"음수";
//		 
//		 System.out.println(result);
	
		
		int jumsu=65;
		
		String result=(jumsu>=60)? "합격": "불합격";
		
		
		System.out.println("jumsu : "+jumsu);
		System.out.println("결과 : "+result);
		
		
		int  result2=(jumsu>=60)?  jumsu+100:  jumsu;
		
		
		System.out.println(result2);
		
		 
		 
		 
		 
		 
	}

}
