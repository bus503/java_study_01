package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Print_Task_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		task(sc);
		sc.close();

	}

	private static void task(Scanner sc) {
		System.out.print("물건 구입 개수 >>");
		int a = sc.nextInt();
		if(a>=1 && a<=9) {
			System.out.printf("할인은 없습니다 %d원입니다", a*100);
			
		}
		else if(a>=10 && a<=19) {
			System.out.printf("%d%% 할인되어  %d원입니다", 10, (a*100)-(a*10));
		}
		else if(a>=20 && a<=99) {
			System.out.printf("%d%% 할인되어 %d원입니다", 15, (a*100)-(a*15));
		}
		else {System.out.printf("%d%% 할인되어 %d원입니다", 20, (a*100)-(a*20));
	}	
}
}