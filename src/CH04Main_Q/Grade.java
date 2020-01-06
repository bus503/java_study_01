package CH04Main_Q;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int total() {
		return math + science + english;
	}

	public int average() {
		return total()/ 3;
	}
}
