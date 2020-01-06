package kr.or.yi.java_study_01.ch03.exception;

import java.util.Scanner;

public class ExceptionEx01_1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		exceptiontest(sc);
		test01(sc);
		sc.close();

	}

	private static void test01(Scanner sc) {
		while (true) {
			System.out.print("나뉨수를 일렵하시오:");
			int dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오:");
			int divisor = sc.nextInt();
			try {
				System.out.println(dividend + "를" +divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
				break;
			}catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다 다시 입력하세요.");
		}
			
	}
}
		
	

	private static void exceptiontest(Scanner sc) {
//		exam01(sc);
		
	}

	private static void exam01(Scanner sc) {
		int dividend;
		int divisor;
		
		
		  System.out.print("나뉨수를 일렵하시오:"); dividend = sc.nextInt();
		  System.out.print("나눗수를 입력하시오:"); divisor = sc.nextInt();
		 
		
		  try { System.out.println(dividend + "를" +divisor + "로 나누면 몫은 " + dividend/divisor + "입니다."); System.out.println("계산 완료"); 
		  // 예외인 경우 계산완료는 안나옴
		  } catch(ArithmeticException e){ 
			  System.out.printf("%d / %d 예외 발생 0으로 나눌수 없음", dividend, divisor); 
		  }	 
		  System.out.println("  main () 수행 완료~~!!!!!!!!");
	}	
		
}
// 일부러 예외발생 시킴 정수를 0으로 나누는 경우 exception이 발생 예외처리를 해줘야함

