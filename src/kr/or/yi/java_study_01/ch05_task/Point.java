package kr.or.yi.java_study_01.ch05_task;

class Point {

	 private int x;
	 private int y;

	 
     public Point() {
		// TODO Auto-generated constructor stub
	}


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return String.format("(%s,%s)의 점", x, y);
	}


	 
}
