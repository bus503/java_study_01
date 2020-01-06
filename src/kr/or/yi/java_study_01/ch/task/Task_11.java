package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();
	}
	private static void test(Scanner sc) {
		System.out.print("첫번째 원의 중심과 반지름 입력 >>");
		int x = sc.nextInt();
		int	y = sc.nextInt();
		int usx = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int usa = sc.nextInt();
		
		int hab = (usx+usa);
		double ab = (x-a) + (y-b);
		if (ab < 0) {
			ab = -ab;
		}
		if(ab <= hab){
			System.out.println("두 원은 서로 겹친다");
		}
		else {
			System.out.println("두원은 겹치지 않는다");
		}
	}
}
