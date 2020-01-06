package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task03_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		System.out.print("정수를 입력하시오. >> ");
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a-i; j++) {
				System.out.print("*");
			}
				System.out.println();	
		}
	}
}		

