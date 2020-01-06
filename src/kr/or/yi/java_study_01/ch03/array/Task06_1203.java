package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task06_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
//		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
//		System.out.print("금액을 입력하시오 >> ");
//		int money = sc.nextInt();
//		int b;

		// for (int i = 0; i < unit.length; i++) {
		// b = money / unit[i];

		// if (money > unit[i]) {

		// System.out.println(unit[i] + "원 짜리 :" + b + " 개");

		// money = money % unit[i];
		// }
//		}
		
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			int res = money / unit[i];
			if(res > 0) {
				System.out.println(unit[i] + "원 짜리 : " + res + " 개 ");
				money = money % unit[i];
			}
		}
	}

}
