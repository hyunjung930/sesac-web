package kr.co.mlec.day04;

public class StringMain {

	public static void main(String[] args) {
		
		String str = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			str = str + i;
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간(초) : " + (end - start)/1000. + "초");
		
		
		StringBuilder sb = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간(초) : " + (end - start)/1000. + "초");
	}
}







