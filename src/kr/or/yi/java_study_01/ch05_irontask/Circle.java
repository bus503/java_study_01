package kr.or.yi.java_study_01.ch05_irontask;

public class Circle extends Shape {
		public void draw() {
			System.out.println("Circle");
			System.out.println("야호");
		}
		public static void main(String [] args) {
			Shape s = new Circle();
			s.draw();
			s.paint(new Shape());
		}
}
