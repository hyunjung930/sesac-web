package day01;
/*
 * 논리연산자 
 * 
 *   &&(and):그리고   : 모두가 true일때만 true
 *    ||( or) : 또는  : 여러개 조건 모두가 false일때 false
 *    
 *    !(not) ~아니다  true-> false     false->true
 *    
 *    ^(XOR) : exclusive-or(배타적 or) 
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
