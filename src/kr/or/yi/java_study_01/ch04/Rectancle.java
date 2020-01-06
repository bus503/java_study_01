package kr.or.yi.java_study_01.ch04;

public class Rectancle {
	int width;
	int height;

	public Rectancle() {
		
	}// 반환타입이없는생성자

	public Rectancle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}
