package kr.or.yi.java_study_01.ch05_task_13;

public interface Shape {
	final double PI =3.14;
	
	void draw();
	
	double getArea();
	
	default public void redraw() {
		System.out.print(" ==== 다시 그립니다.");
		draw();
	}
}
