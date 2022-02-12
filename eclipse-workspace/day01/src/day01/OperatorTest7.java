package day01;

 /*
  *  복합대입연산자
  *  
  *    x+=1   // x=x+1;
  * 
  * 
  */


public class OperatorTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     int su=10;
		     
		     su+=30;  //su=su+30;
		     
		     System.out.println(su);  //40
	
		     su-=2;  //su=su-2
		     System.out.println(su);  // 40-2 =>38  
		     
		     su*=3; // su=38*3 =>114
		     
		     System.out.println(su); 
		     su%=2; // su=114%2
		
		     System.out.println(su);  //0
		     
             System.out.println("====================");		     
		     int su1=10;
		     int su2=5;
		     int su3=3;

		     
		     
		     su1*=su2+su3;  // su1=su1*(su2+su3);
		     
		     
		     
		     
		     //su1+=su2*su3;
		     
		     /*   su1+=(su2*su3)     //  su1=su1+(su2*su3)
		      *   su+=2;   su=su+2
		      * 
		      *   su+=2+3+4;    //su= su+  (     )
		      * 
		      */
		     
		     
		     System.out.println(su1);
		     
		     
		     
		
	}

}
