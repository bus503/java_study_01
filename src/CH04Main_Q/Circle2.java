package CH04Main_Q;

public class Circle2 {
	private double x, y;
	private int radius;

	
	public Circle2() {
		// TODO Auto-generated constructor stub
	}

	public Circle2(double x, double y, int radius) {
		// x, y, radius 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.printf("가장 면적이 큰 원은  (%f , %f)%d", x, y, radius);
	}

	@Override
	public String toString() {
		return String.format("Circle2 [x=%s, y=%s, radius=%s]", x, y, radius);
	}
	
}
