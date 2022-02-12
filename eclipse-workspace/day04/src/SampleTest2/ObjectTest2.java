package SampleTest2;
class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age)	//생성자
	{
		this.name=name;
		this.age=age;
		
	}

	@Override   //리소스에서 투스트링 누루면 아래와 같이 나옴 객체자체를 문자로 표현=> 클래스안에 내용을 문자로 표현하는 것으로 다시 정의(재정
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
		
	
	}
}
public class ObjectTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * hong 20
		 * kim 10
		 * 
		 */
		Person p1 = new Person("hong",20);
		Person p2 = new Person("kim",10);
		
		System.out.println(p1.toString());
		System.out.println(p1);
		String result=p1.toString();
		System.out.println(result);
		
	}

}
