package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();
		
	}

	private static void test(Scanner sc) {
		System.out.print("점 (x,y)의 좌표를 입력하시오 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=100 && 200>=a && b>=100 && 200>=b) {
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.", a, b);
		}
		if(a<100 || 200<a && b<100 && 200<b) {
			System.out.printf("(%d,%d)는 사각형 안에 없습니다.", a, b);
		}
	}
}
