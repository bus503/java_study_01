package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while (res < 3) {
			if (res == 1) {
				System.out.println("for");
				ex_for(sc);
			} else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}
		System.out.println("프로그램 종료.");

		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res = 1;
		while (res != 4) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch (res) {
			case 1:
				gugudan_while();
				break;
			case 2:
				factorail_while(sc);
				break;
			case 3:
				fibonacii_while(sc);
				break;
			default:
				System.out.println("while 문 종료");
			}
		} // while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_while(Scanner sc) {
		System.out.print("피보나치 값을 입력해 주세요 >>");
		int pibo = sc.nextInt();
		System.out.printf("%d = ", pibo);
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 1;
		while (i < pibo + 1) {
			c = a + b;
			a = b;
			b = c;
			System.out.printf("%d  ", c);
			i++;
		}
		System.out.println();
	}

	private static void factorail_while(Scanner sc) {
		System.out.print("팩토리얼 값을 입력해 주세요 >>");
		int fac = sc.nextInt();
		int mul = 1;
		System.out.printf("%d! = ", fac);
		int i = 1;
		while (i < fac + 1) {
			System.out.printf("%d %s", i, i == fac ? "=" : "*");
			mul = mul * i;
			i++;
		}
		System.out.printf("%d %n", mul);

	}

	private static void gugudan_while() {
		int i = 1;
		while (i < 10) {
			int dan = 2;
			while (dan < 10) {
				System.out.printf("%d * %d = %2d  ", dan, i, dan * i);
				dan++;
			}
			System.out.println();
			i++;
		}
	}

	private static void ex_for(Scanner sc) {
		int res = 1;
		for (int i = 0; res != 4; i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch (res) {
			case 1:
				gugudan_for();
				break;
			case 2:
				factorail_for(sc);
				break;
			case 3:
				fibonacii_for(sc);
				break;
			default:
				System.out.println("for 문 종료");
			}
		}
		// for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_for(Scanner sc) {
		System.out.print("피보나치 값을 입력해 주세요 >>");
		int pibo = sc.nextInt();
		System.out.printf("%d = ", pibo);
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i < pibo + 1; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.printf("%d  ", c);
		}
		System.out.println();
	}

	private static void factorail_for(Scanner sc) {
		System.out.print("팩토리얼 값을 입력하세요 >>");
		int fac = sc.nextInt();
		System.out.printf("%d! = ", fac);
		int mul = 1;
		for (int i = 1; i < fac + 1; i++) {
			mul = mul * i;
			System.out.printf("%d %s", i, i == fac ? "=" : "*");

		}
		System.out.println(mul);
	}

	private static void gugudan_for() {
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d * %d = %2d  ", dan, i, dan * i);
			}
			System.out.println();
		}
	}

}
