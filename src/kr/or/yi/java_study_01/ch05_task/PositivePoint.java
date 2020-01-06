package kr.or.yi.java_study_01.ch05_task;

class PositivePoint extends Point {

	public PositivePoint() {
		// TODO Auto-generated constructor stub
	}

	public PositivePoint(int x, int y) {
        move(x,y);
	}
		
	
	public void move(int x, int y) {
		if(x <0 || y <0) {
			return;
		}
		super.move(x, y);
	}

	
	
	
}
