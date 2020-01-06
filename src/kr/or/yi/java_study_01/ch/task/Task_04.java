package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();
	}

	private static void test(Scanner sc) {
		System.out.print("금액을 입력하시오 >>");
		int a = sc.nextInt();
		int b = a/50000 ;
		int c =(a%50000)/10000;
		int d =((a % 50000) % 10000) / 1000;
		int e =(((a % 50000) % 10000) % 1000) / 100;
		int f =((((a % 50000) % 10000) % 1000) % 100) / 50;
		int g =(((((a % 50000) % 10000) % 1000)  % 100) % 50) / 10;
		int h =((((((a  % 50000)  % 10000)  % 1000) % 100) % 50) % 10) / 1;
		
		System.out.printf("오만원 %d매%n 만원 %d매%n 천원 %d매%n 백원 %d개%n 오십원 %d개%n 십원 %d개%n 일원 %d개 %n", b, c, d, e, f, g, h);
	}

}
