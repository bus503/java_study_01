package kr.or.yi.java_study_01.ch04;

public class TestMain {

	public static void main(String[] args) {
//		prnTest();            //밑에 prntest는 스태틱도 아닐뿐더러 객체가 생성되어있지않아서 이렇게 적으면 가르킬 수 없음
		
		TestMain tm = new TestMain();   //그래서 이렇게 객체 생성함
		tm.prnTest();
		

	}
	public static void prn() {
		System.out.println("ㅎㅎㅎ");
	}
	
	public void prnTest() {
		System.out.println("haha");
		TestMain.prn();        //객체는 스태틱에 접근할수있다 다만 스태틱엔 스태틱만 접근
	}
}


