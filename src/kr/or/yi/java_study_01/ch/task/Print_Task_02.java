package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Print_Task_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		task(sc);
		sc.close();

	}

	private static void task(Scanner sc) {
		System.out.print("문자를 입력하시오 >>");
		char a = sc.next().charAt(0);
		
		if(a>='A' && a<='Z') {
			System.out.printf("%c로 변환 되었습니다", (a-'A')+'a');
		}
		else if(a>='a' && a<='z') {
			System.out.println("대문자를 입력하여 주세요");
		}
		else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
}
