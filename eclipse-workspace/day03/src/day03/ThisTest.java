package day03;

class This1
{
	//private String name="ȫ�浿";
	  private String name;
	private int age;
	 private String addr;
	
	/*
	public This1(String name, int age)
	{
		 
		System.out.println(name);
		System.out.println(this.name);
		this.name=name;
	}
	
	*/
	public This1(String name, int age, String addr) {
		//this.name=name;
		//this.age = age;
		this(name, age);  //������ this
		this.addr=addr;
	}
	public This1(String name, int age) {
		 //  this.name=name;
		  this(name);
		this.age=age;
	}
	public This1(String name) {
	     this.name=name;
	}
	
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}




public class ThisTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         This1 ins=new This1("���ϳ�",20,"����");
         
         System.out.println(ins.getName());
         System.out.println(ins.getAge());
         System.out.println(ins.getAddr());
         
         
	}

}
