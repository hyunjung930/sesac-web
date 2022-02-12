package day02;

class Man
{
     String name;
 	
     int age;
}

public class ObjTest2 {
	public static void main(String[] args) {
       
		  Man ins=new Man();
		  Man ins2=new Man();
		  
		  
		  
		  ins.name="hong";
		  ins.age =20;
		  
		  
		  ins2.name="park";
		  ins2.age=10;
		  
		  
		  System.out.println(ins.name);
		  System.out.println(ins.age);

		  System.out.println("=======");
		  
		  System.out.println(ins2.name);
          System.out.println(ins2.age);
		  
		   System.out.println("=========");
		   
		   ins=ins2;
		   
		   
		   System.out.println(ins.name);
		   System.out.println(ins.age);
           System.out.println(ins2.name);
           System.out.println(ins2.age);
		   
		   
	}

}
