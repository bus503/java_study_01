package kr.or.yi.java_study_01.ch05_inter;

public interface PhoneInterface {// 아이콘부터 다름 보라색i가 붙어있음
	// 상수, 추상메소드, 디폴트메소드만 가능하다
	public static final int TIMEOUT = 1000; // 상수

	public abstract void sendCall(); // 추상메소드

	public abstract void receiveCall(); // 추상메소드

	default void prnLogo() {
		System.out.println("** Phone **");
	}
}
