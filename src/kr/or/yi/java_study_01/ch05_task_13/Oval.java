package kr.or.yi.java_study_01.ch05_task_13;

public class Oval implements Shape {
	private int width;
	private int height;
	
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
			System.out.printf("%dx%d내접하는 타원입니다. %n", width, height);
	}

	@Override
	public double getArea() {
		return Shape.PI * width * height;
	}

}

