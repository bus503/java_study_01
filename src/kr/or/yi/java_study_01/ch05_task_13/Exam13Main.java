package kr.or.yi.java_study_01.ch05_task_13;

public class Exam13Main {

	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
		
		Shape[] list = {new Circle(10), new Oval(20,30), new Rect(10,40)};
		for(Shape s: list) {
			s.redraw();
			System.out.println("면적은 " + s.getArea());
		}
	}

}
