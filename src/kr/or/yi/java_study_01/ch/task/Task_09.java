package kr.or.yi.java_study_01.ch.task;


import java.util.Scanner;

public class Task_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();

	}
	private static void test(Scanner sc) {
		
		System.out.print("점 (x1,y1)과 (x2,y2)가 (100,100),(200,200)의 점과 충돌하는가  >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a>=100 && 200>=a || b>=100 && 200>=b || c>=100 && 200>=c || d>=100 && 200>=d) {
			System.out.printf("(%d,%d)과 (%d,%d)는 직사각형과 충돌합니다", a, b, c, d);
		}
		if(a<100 || 200<a && b<100 || 200<b && c<100 || 200<c && d<100 || 200<d ) {
			System.out.printf("(%d,%d)과 (%d,%d)는 직사각형과 충돌하지 않습니다", a, b, c, d);
		}
	}
}

