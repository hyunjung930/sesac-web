import java.util.Objects;

public class Student 
{
	private String name;
	private int age;
	
	// 생성자 
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
