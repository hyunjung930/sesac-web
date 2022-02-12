package p2;
/*
 *   접근지정자 
 *   
 *   private  :클래스내에만 접근  
 *        private int su=10;
 *        
 *   default
 *        같은 패키지에서 접근 
 *        int su=30;
 *        
 *   protected
 *      protected int su=30;
 *      protected void prt(){}
 *   
 *     같은 패키지에서 접근 
 *     다른 패키지일때는 상속관계에서 접근 가능
 *    
 *   
 *   public : 전체 다 공개 
 * 
 * 
 * 
 */
public class Person {

	public   void prt()
	  {
		  System.out.println("prt");
	  }

}
