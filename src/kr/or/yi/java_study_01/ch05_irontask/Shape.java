package kr.or.yi.java_study_01.ch05_irontask;

public class Shape {
	public void draw() {
		System.out.println("Shape");
	}
	public void paint(Shape s) {
		s.draw();
	}
}
