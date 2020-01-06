package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();
}
	private static void test(Scanner sc) {
		System.out.print("원의 중심과 반지름 입력 >>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double redius = sc.nextDouble();
		
		System.out.print("점 입력 >>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double ab = (x-a) + (y-b);
		if (ab < 0) {
			ab = -ab;
		}
		if(ab <= redius) {
			System.out.printf("점 (%1.1f,%1.1f)는 원 안에 있다.", a, b);
		}
		else{
			System.out.printf("점 (%1.1f,%1.1f)는 원 안에 없다.", a, b);
		}
		}
	}

