package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		System.out.print("연산 >>");
		double a = sc.nextDouble();
		String yun = sc.next();
		double b = sc.nextDouble();
		 
		if(yun.equals("+")) {
			System.out.printf("%.0f%s%.0f의 계산 결과는 %.0f", a, yun, b, a+b);
		}
		else if(yun.equals("-")) {
			System.out.printf("%.0f%s%.0f의 계산 결과는 %.0f", a, yun, b, a-b);
		}
		else if(yun.equals("*")) {
			System.out.printf("%.0f%s%.0f의 계산 결과는 %.0f", a, yun, b, a*b);
		}
		else if(yun.equals("/")) {
			if(a==0 || b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.printf("%.0f%s%.0f의 계산 결과는 %.0f", a, yun, b, a/b);
			}
		}
	}
}



