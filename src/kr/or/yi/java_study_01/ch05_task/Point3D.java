package kr.or.yi.java_study_01.ch05_task;

class Point3D extends Point {
    private int z;
	public Point3D() {
		// TODO Auto-generated constructor stub
	}

	public Point3D(int x, int y , int z) {
		super(x, y);
		this.z = z;
	}
	
	public int moveUp() {
		return this.z =z+1;
	}
	
	public int moveDown() {
		return this.z = z-1;
	}
	
	public void move(int a, int b) {
		setX(a);
		setY(b);
	}
	
	public void move(int a, int b, int c) {
		setX(a);
		setY(b);
		this.z =c;
	}

	@Override
	public String toString() {
		return String.format("(%s,%s,%s)의 점",getX(),getY(),z);
	}
	
    
}
