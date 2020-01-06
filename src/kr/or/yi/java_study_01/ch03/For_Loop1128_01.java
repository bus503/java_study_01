package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class For_Loop1128_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		exam3_while(sc);
//		exam3_for(sc);
//		gugudan(sc);
//		gugudan_full();
//		gugudan_full_land();
//		factorial(sc);
		fibonacii(sc);
		sc.close();
	}

	private static void fibonacii(Scanner sc) {
		System.out.print("피보나치 수열 값을 입력하세요 >>");
		int pibo = sc.nextInt();
		System.out.printf("%d = ", pibo);
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 1; i < pibo + 1; i++) {
			 c = a + b;
			 a = b;
			 b = c;
			 System.out.printf("%d %s", c, i==pibo ? " ":"+ ");
			
		}
		
	}

	private static void factorial(Scanner sc) {
		System.out.print("팩토리얼 값을 입력하세요 >>");
		int fac = sc.nextInt();
		int mul = 1;
		System.out.printf("%d!=", fac);
		int i = 1;
		while (i < fac + 1) {

			System.out.printf("%d %s", i, i == fac ? "=" : "*");
			mul = mul * i;
			i++;
		}
		System.out.println(mul);
		fac = sc.nextInt();
	}

	private static void gugudan_full_land() {
		int dan = 1;
		while (dan < 10) {

			int i = 1;
			while (i < 10) {
				System.out.printf("%d * %d = %2d  ", dan, i, dan * i);
				i++;
			}
			System.out.println();
			i = 1;
			dan++;
		}
	}

	private static void gugudan_full() {
		int i = 1;
		while (i < 10) {

			int dan = 1;
			while (dan < 10) {
				System.out.printf("%d * %d = %2d  ", dan, i, dan * i);
				dan++;
			}
			System.out.println();
			dan = 1;
			i++;
		}
	}

	private static void gugudan(Scanner sc) {
		System.out.println("단을 입력하세요 >>");
		int a = sc.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d는 %d입니다%n", a, i, a * i);
			i++;
		}

	}

	private static void exam3_for(Scanner sc) {
		int sum = 0;
		int count;
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요");
		int n = sc.nextInt();
		for (count = 0; n != -1; count++) {
			sum = sum + n;
			n = sc.nextInt();
		}
		System.out.printf("정수의 개수는 %d 평균은 %.1f입니다", n, (double) sum / count);
	}

	private static void exam3_while(Scanner sc) {
		int sum = 0;
		int count = 0;

		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요");
		int n = sc.nextInt();
		while (n != -1) {
			sum = sum + n;
			count++;
			n = sc.nextInt();
		}
		System.out.printf("정수의 개수는 %d 평균은 %.1f입니다", n, (double) sum / count);
	}

}
