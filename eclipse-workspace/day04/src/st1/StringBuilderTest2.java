package st1;
/*
 *Sting: 정적(고정적 )자료 문자열 상수에서 사용
 *	조작=> 새로운 메모리를 할당
 *		=> 비효율
 *
 	StringBuffer			StringBuilder	: 문자 조작 용이
 	동기처리					비동기처리 
 	안정
 * 							속도가 StirngBuffer에 비해 빠르다
 * 
 * cf) 
 * 
 * 
 * 
 * 
 */
public class StringBuilderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder("hello");
		
		
		
		sb.append("안녕하세요");
		sb.append("만나서 반갑습니다 ");
		
		String result=sb.toString();
		
		System.out.println(result);
		System.out.println(sb.toString());
		System.out.println(sb);
		System.out.println("===========");
		sb.insert(2,"홍길동님");
		
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
