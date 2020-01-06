package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_12_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();
	}

	private static void test(Scanner sc) {
		System.out.print("달을 입력하세요(1~12) >>");
		int a = sc.nextInt();
	
		if(3<=a && 5>=a){
			System.out.println("봄");
		}
		else if(6<=a && 8>=a) {
			System.out.println("여름");
		}
		else if(9<=a && 11>=a) {
			System.out.println("가을");
		}
		else if(12==a || 1==a || 2==a) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
