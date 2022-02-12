package day02;

 class Cal
 {

	 /*
	     void add(int su1, int su2)
	      {
	    	   int a=0;
	    	   System.out.println(su1); 
	    	   System.out.println(su2);
	    	   a=su1+su2;
	    	   System.out.println("합계:"+a);
	      }
	 */
   	 
	  int add2(int su1, int su2)  // int su1, int su2 :  매개변수  , int: return 타입 
	    {
	    	 int add=su1+su2;
	    	 return add;
	    }
	 
	 
	 
 }


public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Cal ins=new Cal();
            //ins.add(10,20);
         int result=ins.add2(100,200);
          System.out.println(result);  
         
         
         
	}

}
