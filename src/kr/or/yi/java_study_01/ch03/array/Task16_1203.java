package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task16_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		String com[] = { "가위", "바위", "보" };
		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.");
		String res;
		int comresidx;
		do {
			System.out.println("가위 바위 보!! >>");
			res = sc.nextLine();
			
			if(res.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			comresidx = (int)(Math.random()*3);
			System.out.printf("사용자 : %s 컴퓨터 : %s%n", res , com[comresidx]);
			resultwinorlose(res, com[comresidx]);
		} while (!res.equals("그만"));
	}

	private static void resultwinorlose(String user, String com) {
		if ( user.equals("가위")) {
			if(com.equals("가위")) {
				System.out.println("비김");
			}else if(com.equals("바위")) {
				System.out.println("컴퓨터의 승리 !");
			}else {
				System.out.println("사용자의 승리 !");
			}
		}else if( user.equals("바위")) {
			if(com.equals("가위")) {
				System.out.println("사용자의 승리 !");
			}else if(com.equals("바위")) {
				System.out.println("비김");
			}else {
				System.out.println("컴퓨터의 승리 ! ");
			}
		}else {
			// 보를 입력하는 경우
			if(com.equals("가위")) {
				System.out.println("컴퓨터의 승리 !");
			}else if(com.equals("바위")) {
				System.out.println("사용자의 승리 !");
			}else {
				System.out.println("비김");
			}
		}
		
	}

}
