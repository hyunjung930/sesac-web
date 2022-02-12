package day01;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="고양이";
		switch(data)
		{
		case "강아지":
			 System.out.println("애완견");
			 break;
			 
		case "고양이":
			  System.out.println("애완묘");
			  break;
		case "햄스터":
			  System.out.println("애완햄스터");
			  break;
	    default:
	    	System.out.println("나머지 동물");
		
		}
		
		
		
		
		
	}

}
