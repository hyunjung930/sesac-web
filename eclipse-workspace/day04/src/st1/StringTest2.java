package st1;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hong";
		String s2="hong";	 //""사용해주는게 좋다 
		String s3=new String("hong");
		
		System.out.println(s1==s2);		// 값을 비교하는 것은 == 사용 
		System.out.println(s1==s3);
		
		System.out.println("=======");
		System.out.println(s1.equals(s2));	// 객체끼리의 비교는 이퀄
		System.out.println(s1.equals(s3));
		
		
		
	}

}
