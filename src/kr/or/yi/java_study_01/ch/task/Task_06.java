package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		System.out.print("정수 3개를 입력하시오 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a+b)>c && (a+c)>b && (b+c)>a && (b+a)>c && (c+a)>b && (c+b)>a) {
			System.out.println("삼각형이 됩니다");
		}
		else{
		 System.out.println("삼각형이 안됩니다");
		}	
	}
}
