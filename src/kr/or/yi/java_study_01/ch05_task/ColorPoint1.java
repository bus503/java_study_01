package kr.or.yi.java_study_01.ch05_task;

class ColorPoint1 extends Point {

	private String color;
	
	public ColorPoint1() {
		this.color = "black";
	}
	
	public ColorPoint1(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("%s색의 %s", color, super.toString());
	}

	public void setColor(String color) {
		this.color = color;
	}
	
   public void setXY(int x, int y) {
	   setX(x);
	   setY(y);
   }
    
  
  
	
	
	
}
