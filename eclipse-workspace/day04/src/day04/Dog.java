package day04;
/*
 * 
 * 추상클래스: class 앞에 abstract를 붙이면 된다.
 * 
 * => 객체 생성을 하지 않는 클래
 * 	객체 생성을 하기 위해서는 일반클래스에서 상속받아서 사용한다. 
 * 	매서드 앞에 abstract를 붙인 메서드를 추상메서드라고 함
 * 		=> 몸통이 없음 
 * 
 * 		추상클래스는 추상 메서드가 있어야 한다. ㄴ
 * 		추상메서드가 포함된 클래스는 추상클래스다.ㅇ
 * 
 * 		형변환 
 * 
 */
public abstract class Dog {

	public void sound()
	{
		System.out.println("멍멍 ");
	}
	
	public abstract void act();	// 추상메서드
		// 추상클래스는 반드시 추상메서드가 1개이상 존재해야한다. = false
}
