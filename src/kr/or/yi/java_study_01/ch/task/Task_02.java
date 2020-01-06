package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();
	}

	private static void test(Scanner sc) {
		System.out.print("원화를 입력하세요(단위 원) >>");
		int a = sc.nextInt();
		double b = a/1100;
		{System.out.printf("%d원은 $%1.1f입니다", a, b);}
	}
}
