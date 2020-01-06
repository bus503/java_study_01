package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class For_Loop1127_01 {

	public static void main(String[] args) {
//		factory(sc);
	}

	private static void factory(Scanner sc) {
		fac(3);
}

	private static void fac(int a) {
//		int a = 5;
		int b = 1;
		System.out.printf("%d!=", a);
		for(int i=1; i<a+1; i++) {
			b = b * i;
			System.out.printf("%d %s", i, i==a?"=":"*");
		}
		System.out.println(b);
	}

	
	
	private static void factory() {
		int fac = 1;
		for (int i = 1; i < 6; i++) {
			System.out.println("숫자를 입력하세요");
//			int fac1 = fac1 * i;
//			System.out.println(fac1);
		}
	}

}
