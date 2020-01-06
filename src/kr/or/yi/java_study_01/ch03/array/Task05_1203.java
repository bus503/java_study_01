package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task05_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		int[] intArray = new int[10];

		System.out.print("양의 정수 10개를 입력하시오 >>");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			if (intArray[i] % 3 == 0) { // 만약 그냥 i만 하면 0 3 6 9번째 숫자만 나옴
				System.out.print(intArray[i] + " ");
			}
		}
	}
}
