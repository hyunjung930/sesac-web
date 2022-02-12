package day03;

  class Sample2
  {
	  
	  public Sample2()  //생성자
	  {
		  System.out.println("생성자 ");
	  }
	  static {
		   
		  System.out.println("static 초기화 블록");
		  
	  }
	     
  }

public class StaticTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sample2 ins=new Sample2();
     Sample2 ins2=new Sample2();
  
	}
}
