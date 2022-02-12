package day02;

/*
 *   클래스   : 
 *      값 => 변수   
 *      동작 =>  함수 (메서드 method)
 *   
 *   객체:  값,  동작   
 *   
 *     홍길동
 *     나이
 *     주소
 *     eat
 *     walk
 *     study 
 */


class Person4
{
	
	   void paint()
	    {
	    	System.out.println("페인트를 칠합니다.");
	    	System.out.println("색상은 노랑색입니다.");
	    	
	    }
	
	   int prt()
	   {
		   System.out.println("print1");
		   System.out.println("print2");
		   
		   return 10;  // return 값; 
	   }
	   
	   
}

public class MethodTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person4 ins=new Person4();
          int su1= ins.prt();  //메서드 호출
         
           System.out.println("=======");
         Person4 ins2=new Person4();
            int su2=  ins2.prt();
		   System.out.println(su1);
		   System.out.println(su2);
		   
		   System.out.println("========");
		   
		   
		   ins.paint();
		   ins2.paint();
		   
		   
		   
		
	}
}
