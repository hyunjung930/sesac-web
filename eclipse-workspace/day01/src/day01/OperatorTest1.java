package day01;

/*
 *   연산자 
 *   
 *   단일연산자
 *       부호연산자  + -
 *       증가연산자  ++
 *       감소연산자      --
 *   
 *   
 *   이항연산자
 *      사칙연산자   +   -   *    /  %(나머지)
 *      비교연산자    >  >=  <  <=  ==(같다)  !=(같지않다)
 *      논리연산    &&(and)   ||(or)    !(not)
 *      비트연산자
 *           &(and)   |(or)  ^(xor: exclusive or)  ~(not)
 *     
 *     연결연산자  +
 *     
 *  삼항연산자 (조건연산)
 *     (조건)? 참: 거짓;
 *      
 */




public class OperatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int d1=10;
         
         int d2=-d1;  // +   -  
         System.out.println(d1);
         System.out.println(d2);
         
         //증감연산자 
         
         System.out.println("=================");
         
         int x=10;
         int y=++x;  //전위연산자  x:11  y=11
         
         System.out.println(x);
         System.out.println(y);
         
         System.out.println("================");
         
         x=10;
         y=x++;  //후위연산자    y=10   x=11
         
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
