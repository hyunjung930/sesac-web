package st1;

public class StringBuilderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder(10);
		StringBuilder sb3=new StringBuilder("hong");
		
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		System.out.println("==============");
		
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		
	}

}

