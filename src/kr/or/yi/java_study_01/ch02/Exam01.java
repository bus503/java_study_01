package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;
// ctrl + shift + o 자동 임폴트

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("두 정수를 입력하시오. 공백으로 분리  >>");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		 
		
		// a=5, b=2   
		// 합은 7 
		// 차는 3 
		// 곱은 10 
		// 나누기는 2.5
		int res = sum(a, b); // 두 수의 합
		System.out.printf("두 수 (%d, %d) 의 합은 %d%n", a, b, res);
		
		res = sub(a, b); // 두 수의 차
		System.out.printf("두 수 (%d, %d) 의 차는 %d%n", a, b, res);
		
		res = mul(a, b); // 두 수의 곱
		System.out.printf("두 수 (%d, %d) 의 곱은 %d%n", a, b, res);
		
		
		/* float resc = div(a, b); */ // 두 수의 몫  //있어도 되고 없어도 된다
		 	System.out.printf("두 수 (%d, %d) 의 몫은 %.1f%n", a, b, div(a, b));
		
		sc.close();
		
	}
	

		private static float div(int a, int b) {
		return a / (float)b;
	}

		private static int mul(int a, int b) {
		return a * b;
	}


		private static int sum(int a, int b) {
		return a + b;
	}


		private static int sub(int a, int b) {
		return a - b;
	}

}
