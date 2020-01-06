package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Print_Task_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		task(sc);
		sc.close();

	}

	private static void task(Scanner sc) {
		System.out.print("가장 작은 값은 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && b>c && c<a) {
			System.out.printf("%d, %d, %d 중 가장 작은 값은 %d 입니다", a, b, c, c);
		}
		else if(a>b && b<c && c<a) {
			System.out.printf("%d, %d, %d 중 가장 작은 값은 %d 입니다", a, b, c, b);
		}
		else if(a<b && b>c && c<a) {
			System.out.printf("%d, %d, %d 중 가장 작은 값은 %d 입니다", a, b, c, c);
		}
		else if(a<b && b>c && c>a) {
			System.out.printf("%d, %d, %d 중 가장 작은 값은 %d 입니다", a, b, c, a);
		}
		else if(a>b && b<c && c>a) {
			System.out.printf("%d, %d, %d 중 가장 작은 값은 %d 입니다", a, b, c, b);
		}
		else {
			System.out.printf("%d, %d, %d 중 가장 작은 값은 %d 입니다", a, b, c, a);
		}
	}

}
