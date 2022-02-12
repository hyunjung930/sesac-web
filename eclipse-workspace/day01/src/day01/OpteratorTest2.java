package day01;

/*
 *   산술연산자     +    -   *    /  %
 * 
 */




public class OpteratorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int su1=10;
		  int su2=3;
		  
          int add=su1+su2;
          int sub=su1-su2;
          int mul =su1*su2;  //3.333
          double div=(double)su1/su2;  // 3 => 3.0
          
          int mod=su1%su2;
          
       System.out.println(add);
        System.out.println(div);   
          
          
		  
		  
//          System.out.println(su1+su2);  // 13 
//          System.out.println(su1-su2);   // 7
//          System.out.println(su1*su2);   //30
//          System.out.println(su1/su2);  // 3  =>?  
//          System.out.println(su1%su2);  // 1
	
        
        byte a=20;
        byte b=(byte)-a; 
        System.out.println(b);


	
	
	}

}
