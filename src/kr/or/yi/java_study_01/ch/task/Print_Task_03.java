package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Print_Task_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		task(sc);
		sc.close();

	}

	private static void task(Scanner sc) {
		System.out.print("자유이용권이십니까 , 입장권이십니까? >>");
		String a=sc.next();
		System.out.print("현재시간을 입력해주세요(시간은 9에서 24중 입력해주세요) >>");
		int b=sc.nextInt();
		System.out.print("나이를 입력해주세요 >>");
		int c=sc.nextInt();
		
		if (a.equals("자유이용권")) {
			if (b >= 9 && b < 17) {
				if (c >= 13 && c <= 64) {
					System.out.println("자유이용권 주간 대인이시네요 34000원입니다");
				} 
				else if (c >= 3 && 12 >= c || 65 <= c) {
					System.out.println("자유이용권 주간 소인이시네요 25000원입니다");
				} 
				else {
					System.out.println("입장할 수 없습니다");
				}
			} 
			else if (b >= 17 && b <= 24) {
				if (c >= 13 && c <= 64) {
					System.out.println("자유이용권 야간 대인이시네요 29000원입니다");
				} 
				else if (c >= 3 && 12 >= c || 65 <= c) {
					System.out.println("자유이용권 야간 소인이시네요 21000원입니다");

				} 
				else {
					System.out.println("입장할 수 없습니다");
				}
			} 
			else {
				System.out.println("영업시간이 아닙니다");
			}
		} 
		else if (a.equals("입장권")) {
			if (b >= 9 && b < 17) {
				if (c >= 13 && c <= 64) {
					System.out.println("입장권 주간 대인이시네요 27000원입니다");
				} 
				else if (c >= 3 && 12 >= c || 65 <= c) {
					System.out.println("입장권 주간 소인이시네요 20000원입니다");
				} 
				else {
					System.out.println("입장할 수 없습니다");
				}
			} 
			else if (b >= 17 && b <= 24) {
				if (c >= 13 && c <= 64) {
					System.out.println("입장권 야간 대인이시네요 23000원입니다");
				} 
				else if (c >= 3 && 12 >= c || 65 <= c) {
					System.out.println("입장권 야간 소인이시네요 17000원입니다");

				} 
				else {
					System.out.println("입장할 수 없습니다");
				}
			} 
			else {
				System.out.println("영업시간이 아닙니다");
			}
		}
	}
}	
	
	
