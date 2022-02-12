package day04;
/*
 *일반클래스에서는 abstract method를 오버라이딩 해서 처리..
 *
 * Override(재정의)
 * 
 * 상속관계에서 부모클래스에서 정의한 메서드를 자식클래스에서 다시 정의 
 * 
 * 매서드 이름 , 매개변수 타입, 순서 갯수가 같아야 
 * 접근지정자 관점 같거나 범위가 넓어야(private)
 * Exception관점
 * 
 * 접근지정자 
 * private : 클래스내에
 * default: 같은패키지 
 * protected: 같은 패키지, 다른 패키지일경우 상속관계에서 접근 
 * public: 전
 * 
 * 
 * 
 */
public class Schnauzer extends Dog {

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("사교적임, 장난을 잘침 ");
	}
		public void test() 
		{
			System.out.println("슈나우저!!!! ");
	}

}
