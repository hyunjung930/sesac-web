package st1;
/*
 * 
 * string class
 * 
 * 
 */
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name="hong";
	
	// String(char[] value)
	char[] ch= {'h','o','n','g'};
	String name2=new String(ch);
			
	// String(String original)
	
	String name3=new String("hong");
		
	System.out.println(name.toString());
	System.out.println(name); 	//toString자동으로 호출 
	String result=name.toString();
	System.out.println(result);
	
	System.out.println("===========");
	System.out.println(name2.toString());
	System.out.println(name2);
	
	
	}

}
