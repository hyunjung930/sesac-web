package st1;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name="hong";
	// name=name+"park";
	
	name+="123";
	name+="abc";
	
	
		System.out.println(name);
		System.out.println("========");
		
		String name2="hong";
		// name2.concat("123");
		
		name2=name2.concat("123");	//새로운메모리 만들면서 추가 함-> 메모리 잡아먹음 
		
		System.out.println(name2);
		
		System.out.println("==============");
		System.out.println("==============");
		
		//StirngBuilder StringBuffer
		
		
	}

}
