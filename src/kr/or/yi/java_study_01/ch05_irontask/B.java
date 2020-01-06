package kr.or.yi.java_study_01.ch05_irontask;

public class B extends OddDetector {

	public B(int n) {
		super(n);
	}
	

	@Override
	public boolean isOdd() {
		if(n%2==0) {
			return false;
		}
		return true;
	}


	public static void main(String [] args) {
		B b =new B(10);
		System.out.println(b.isOdd());
	}

}
