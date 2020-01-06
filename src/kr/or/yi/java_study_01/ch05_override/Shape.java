package kr.or.yi.java_study_01.ch05_override;

public abstract class Shape {
	public Shape next;

	public Shape() {
	}

	public void draw() {
		System.out.println("Shape");
	}
}
