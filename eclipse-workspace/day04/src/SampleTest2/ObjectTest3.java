package SampleTest2;

public class ObjectTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s1=new Student("hong",20);
	Student s2=new Student("hong",20);
	Student s3=new Student("hong",20);
	
	s3=s1;
	
	boolean result=s1.equals(s2);
	boolean result2=s1.equals(s3);
	
	System.out.println(result);	//false
	System.out.println(result2);	//true
		
		
	}

}
