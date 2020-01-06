package kr.or.yi.java_study_01.ch05_task;

class ColorPoint extends Point {

	 private String color;

	 public void setColor(String color) {
		this.color = color;
	 }
	 
	 public void setXY(int x, int y) {
		super.move(x, y);
	 }
	 public ColorPoint(int x, int y, String color) {
		 super(x,y);
		 this.color= color;
	 }

	@Override
	public String toString() {
		return String.format("%s색의 (%d,%d)의 점", color,this.getX(),this.getY());
	}
	 
	 
}
