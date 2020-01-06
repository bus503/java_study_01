package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class For_Loop1129_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		test01();
//		test02();
//		test03();
//		test04();
//		test05();
		test06();
		sc.close();
}
	private static void test06() {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		int tsum = 0;
		int i = 0;
		do {
			sum = sum + i;

			if (i % 3 == 0) {
				tsum = tsum + i;
			}
			if (i % 2 == 0) {
				evensum = evensum + i;
			} 
			else if (i % 2 == 1) {
				oddsum = oddsum + i;
			}
			i++;
		} 
		while (i < 101);
		System.out.printf("전체합 %d%n짝수합 %d%n홀수합 %d%n3배수합 %d%n", sum, evensum, oddsum, tsum);
}
	

	private static void test05() {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		int tsum = 0;
		int i = 0;
		while (i < 101) {
			sum = sum + i;
			
			if (i % 3 == 0) {
				tsum = tsum + i;
			}
			if (i % 2 == 0) {
				evensum = evensum + i;
			} 
			else if (i % 2 == 1) {
				oddsum = oddsum + i;
			}
			i++;
		}
		System.out.printf("전체합 %d%n짝수합 %d%n홀수합 %d%n3배수합 %d%n", sum, evensum, oddsum, tsum);
	}
	


	private static void test04() {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		int tsum = 0;
		for (int i = 0; i < 101; i++) {
			sum = sum + i;

			if (i % 3 == 0) {
				tsum = tsum + i;
			}
			if (i % 2 == 0) {
				evensum = evensum + i;
			} 
			else if (i % 2 == 1) {
				oddsum = oddsum + i;
			}
		}
		System.out.printf("전체합 %d%n짝수합 %d%n홀수합 %d%n3배수합 %d%n", sum, evensum, oddsum, tsum);
	}


	private static void test03() {
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {

				if (i == 5);

				System.out.printf("%d * %d = %d  ", dan, i, dan * i);
				break;

			}
			System.out.println();
		}
	}

	private static void test02() {
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {

				if (i == 5)
					continue;
				System.out.printf("%d * %d = %2d ", dan, i, dan * i);
			}
			if (i == 5) {
				continue;
			}
			System.out.println();
		}

	}

	private static void test01() {
		char c = 'a';
		do {
			System.out.print(c);
			c = (char) (c + 1);

		} while (c <= 'z');
	}
}
