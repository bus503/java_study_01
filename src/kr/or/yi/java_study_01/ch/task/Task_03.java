package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test_03(sc);
		sc.close();
	}

	private static void test_03(Scanner sc) {
		System.out.print("2자리수 정수 입력(10~99) >>");
		int a = sc.nextInt();
		int b = a/10;
		int c = a%10;
		if((10<=a) && (a < 99)){
		if(b==c)
		{System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");}
		else if(b!=c)
		{System.out.println("No! 10의 자리와 1의 자리가 다릅니다");}
		}
	}
}

