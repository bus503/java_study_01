package kr.or.yi.java_study_01.ch03;

public class For_Loop1127_02 {

	public static void main(String[] args) {
		fac01(7);
//		fac01(3);
//		fac02(3);
	}

	private static void fac02(int fac) {
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		int res = 1;
		System.out.printf("%d!=", fac);
		for (int i=fac; i>0; i--) {
			res = res * i;
			System.out.printf("%d %s", i, i==1?"=":"*");
		}
		System.out.printf("%d", res);
	}

	private static void gugu(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d*%d=%d%n", a, i, a * i);
		}
	}

	private static void fac01(int faca) {
		// 5! = 1 * 2 * 3 * 4 * 5 = 120 faca=faca * i
		int res = 1;
		System.out.printf("%d! =", faca);
		for (int i = 1; i < faca + 1; i++) {
			res = res * i;
			System.out.printf("%d %s", i, i == faca ? "=" : "*");
		}
		System.out.println(res);
	}
}
