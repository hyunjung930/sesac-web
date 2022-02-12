package day01;


/*
 *     byte   short  int long float double
 *         char->int
 * 
 * 
 */
public class Variable_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		  byte a=10;
		  int b=a;
		  
		  System.out.println(a+", "+b);
		
		  float c=10.2f;
		  
		  int  d=(int)c; //강제 형변환
		  
		  System.out.println(c +", "+d);
		
		  
		 char ch='A';
		 int chint=ch;
		 
		 System.out.println(ch);
		 System.out.println(chint);
		  
		 
		 
		 
		 
		
	}

}
