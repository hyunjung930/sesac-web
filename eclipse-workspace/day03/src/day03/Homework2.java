package day03;
class Sungjuck
{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private float avg;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	
}

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sungjuck s=new Sungjuck[3];
		System.out.println(s.getName);
		System.out.println(s.getKor);
		System.out.println(s.getEng);
		System.out.println(s.getTot);
		System.out.println(s.getAvg);
	}

}
