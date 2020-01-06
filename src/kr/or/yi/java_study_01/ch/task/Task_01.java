package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();
	}

	private static void test(Scanner sc) {
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수가 >>");
		String cs = sc.next();
		System.out.print("영희가 >>");
		String yh = sc.next();
		if(cs.equals("가위")) {
			if (yh.equals ("가위")) 
			{System.out.println("비겼습니다");}
			else if (yh.equals("바위")) 
			{System.out.println("영희가 이겼습니다");}
			else 
			{System.out.println("철수가 이겼습니다");}
		}
		else if(cs.equals("바위")) {
			if(yh.equals("가위"))
			{System.out.println("철수가 이겼습니다");}
			else if (yh.equals("바위"))
			{System.out.println("비겼습니다");}
			else {System.out.println("영희가 이겼습니다");}
		}
		else if(cs.equals("보")) {
			if(yh.equals("가위")) {
				System.out.println("영희가 이겼습니다");
			}
			else if(yh.equals("바위")) {
				System.out.println("철수가 이겼습니다");
			}
			else{
				System.out.println("비겼습니다");
			}
		}
	}
}



