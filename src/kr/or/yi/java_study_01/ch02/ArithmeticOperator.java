package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		getHourMinuteSecond(sc);
// 		getPayCount(sc);
//		prefix();       
//		postfix();
// 여기에 있는 메인이 실행되면 여기 있는 문장으로 가서 바디를 수행하고 끝나면 리턴되어 메인에 있는 다음 문장으로 감 무조건 위에서 아래.
		
		sc.close();
	}
	

	private static void prefix() {
		int a = 10;
		int b = ++a;
		System.out.printf("a = %d b = %d %n", a, b); 
	}

	private static void postfix() {
		int a = 10; // a는 11 b는 10이 나옴
		int b = a++; // 후위증감
		System.out.printf("a = %d b = %d %n", a, b);
	}

	public static void getHourMinuteSecond(Scanner sc) {
		System.out.printf("정수를 입력하세요");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.printf("%d초는 %d시간 %d분 %d초입니다.%n", time, hour, minute, second);
	}

	public static void getPayCount(Scanner sc) {
		System.out.print("금액을 입력하세요");
		int pay = sc.nextInt(); // 97870원
		int 오만원 = pay / 50000;
		int 만원 = (pay % 50000) / 10000;
		int 오천원 = ((pay % 50000) % 10000) / 5000;
		int 천원 = (((pay % 5000) % 10000) % 5000) / 1000;
		int 오백원 = ((((pay % 5000) % 10000) % 5000) % 1000) / 500;
		int 백원 = (((((pay % 5000) % 10000) % 5000) % 1000) % 500) / 100;
		int 오십원 = ((((((pay % 5000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int 십원 = (((((((pay % 5000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		// 오만원 만원 오천원 천원 오백원 백원 오십원 십원

		System.out.printf("오만원 %d장 만원 %d장 오천원 %d장 천원 %d장 오백원 %d개 백원 %d개 오십원 %d개 십원 %d개 %n", 오만원, 만원, 오천원, 천원, 오백원, 백원,
				오십원, 십원);

	}

}
