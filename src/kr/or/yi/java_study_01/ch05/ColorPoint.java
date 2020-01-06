package kr.or.yi.java_study_01.ch05;

public class ColorPoint extends Point {
		private String color;

		public ColorPoint(int x, int y, String color) {
			super(x,y);
			this.color =color;
		}

		public ColorPoint() {
			// TODO Auto-generated constructor stub
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		public void showColorPoint() {
			System.out.print(color);
			showPoint();
	}	
}
