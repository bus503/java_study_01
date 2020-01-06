package kr.or.yi.java_study_01.ch05;

public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public Point() {
		// TODO Auto-generated constructor stub
	}


	public void setxy(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint(){
		System.out.println("(" + x +  "," + y + ")");
	}
}
