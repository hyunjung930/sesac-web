package kr.co.mlec.day02;

class B {
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}

class A<T> {
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		
		A<String> obj1 = new A<String>();
		obj1.setData("hello");
		System.out.println(obj1.getData());
		
		A<Person> obj2 = new A<Person>();
		obj2.setData(new Person("홍길동", 22));
		Person p = obj2.getData();
		
		B obj3 = new B();
		obj3.setData("hello");
		
		B obj4 = new B();
		obj4.setData(new Person("홍길동", 22));
		Person p2 = (Person)obj4.getData();
		
	}
}







