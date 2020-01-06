package kr.or.yi.java_study_01.ch05_inter;

public class SamsungPhone implements PhoneInterface {

	private String pName; // 제품명
	private int pYear; // 생산연도

	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpYear() {
		return pYear;
	}

	public void setpYear(int pYear) {
		this.pYear = pYear;
	}

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");  //인터페이스에 정의된 메소드

	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");  //인터페이스에 정의된 메소드

	}
	public void flash() {
		System.out.println("전화기에 불이 켜짐");
	}
}
