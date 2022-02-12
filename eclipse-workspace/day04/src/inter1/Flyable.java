package inter1;
/*
 * 
 * 인터페이스
 * interface 인터페이스이름
 * 객체생성을 못함 
 *  모든메서드 public abstract method
 *  클래스에서 상속받으려면 implements
 *  변수는 public static final or public final static
 * class 클래스명 implements 인터페이스명1,인터페이스명2,인터페이스명3
 * {
 * 
 * }
 */
public interface Flyable {

	 int su=10;	//final static
	void fly();
	default void prt() //default매서드:jdk8
	{
		System.out.println("prt!!!");
	}
}
