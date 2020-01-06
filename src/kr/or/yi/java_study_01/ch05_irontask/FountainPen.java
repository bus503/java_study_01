package kr.or.yi.java_study_01.ch05_irontask;

public class FountainPen extends BallPen implements Refill{
	public void refill(int n) {
		setAmount(n);
// amount =n;
	}
}
