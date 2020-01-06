package kr.or.yi.java_study_01.ch05_override;

public class Line extends Shape {

	@Override // 에너테이션 없어도 관계없는데 오버라이드된 문법확인용임
	public void draw() {
		System.out.println("Line");
	}
}
