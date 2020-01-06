package CH04Main_Q;

public class TV {
	public String name;
	public int year;
	public int inch;
	
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}


	public void show() {
		System.out.printf("%s 에서 만든 %d년형 %d인치 TV", name, year, inch);
		
	}
}

