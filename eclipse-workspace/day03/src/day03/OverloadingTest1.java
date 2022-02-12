package day03;

/*
 *   메서드 오버로딩   
         클래스내에서 이름이 같은 메서드를 여러개 정의할 수 있다. 

      메서드이름이 같아야
     매개변수 타입, 순서, 갯수가 다를때 다른 메서드로 인식
      리턴타입과는 무관
 * 
 * 
 * 
 */

class Overloading1
{
	void prt() {}
	void prt(String name) {}
	void prt(String name, int age) {}
	void prt(int age, String name) {}
	void prt(String name, String addr) {}
	
	int prt() {}
}




public class OverloadingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
