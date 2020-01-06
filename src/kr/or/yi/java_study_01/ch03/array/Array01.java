package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		array_01();
		// 선언과 동시에 초기화
//		array_02();
//		array_03();
		array_04(sc);
		sc.close();
	}

	private static void array_04(Scanner sc) {
		int intArray[] = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.printf("정수형(int) 범위 %d ~ %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		System.out.print("양수 5개를 입력하세요 ");
		
		for (int i = 0; i < 5; i++) {
			intArray[i] = sc.nextInt();
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.printf("가장 큰 수는  %d 가장 작은 수는 %d 입니다%n", max, min);

		System.out.print("찾고자하는 정수값을 입력하세요 >>>");
		int searchKey = sc.nextInt();
		// intArray에 searchKey가 존재하면 위치하고 있는 인덱스를 출력하고 찾지못하면 -1을 출력하도록 하세요
		int findIndex = -1;
		int i;
		for (i = 0; i < intArray.length; i++) {
			if (searchKey == intArray[i]) {
				findIndex = i;
			}
		}
		System.out.printf("searchKey %d는 %d위치에 있습니다", searchKey, findIndex);
	}

	private static void array_03() {
		char[] chArr = new char[26];
		char ch = 'a';

		for (int i = 0; i < chArr.length; i++) {
//			System.out.printf("%c", chArr[i]);
			chArr[i] = ch++;
		}
		System.out.println();
		for (int i = 0; i < chArr.length; i++) {
			System.out.printf("%c ", chArr[i]);
		}
	}

	private static void array_02() {
		int[] intArray = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("%d ", intArray[i]);
		}
		intArray[2] = 10;

		System.out.println();
		int[] myArray = intArray;
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("%d ", myArray[i]);
		}
	}

	private static void array_01() {
		int[] intArray01 = null; // 정수형 배열 선언
		System.out.println(intArray01); // 지역변수라서 초기화 선언해야함 null 넣어줌
		intArray01 = new int[5];
		System.out.println(intArray01[0]); // [0] 없으면 첫번째요소 주소값이 나옴
		System.out.println(intArray01[1]);
		System.out.println(intArray01[2]);
		System.out.println(intArray01[3]);
		System.out.println(intArray01[4]);

		System.out.println("배열의 크기 " + intArray01.length); // 배열의 길이 구하는거
		for (int i = 0; i < intArray01.length; i++) {
			System.out.printf("%d ", intArray01[i]);
		}
	}

}
