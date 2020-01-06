package CH04Main_Q;

public class Circle {
	private double x;
	private double y;
	private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double x, double y, int radius) {
		// x, y, radius 초기화
		this.x = x;
		this.y = y;
		this.setRadius(radius);
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
		
	}
	/*
	 * public double getArea() { return Math. }
	 */
}
