package inter1;

public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlyableImple ins=new FlyableImple();
		
		ins.fly();
		ins.run();
		
		System.out.println(FlyableImple.su);
		System.out.println("=========");
		
		Flyable f= new FlyavleImple();
		f.fly();
		f.prt();
		
		//f.test();
		//f.run();
		
		System.out.println("=======");
		
		Runnable r=new FlyableImple();
		r.run();
		
		
	}

}
