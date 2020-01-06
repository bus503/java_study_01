package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();
	}

	private static void test(Scanner sc) {
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int a = sc.nextInt();
			System.out.print("박수");
		if(a%10==3 || a%10==6 || a%10==9) {
			System.out.print("짝");
		}
		if(a/10==3 || a/10 ==6 || a/10==9) {
			System.out.print("짝");
		}
	}
}
