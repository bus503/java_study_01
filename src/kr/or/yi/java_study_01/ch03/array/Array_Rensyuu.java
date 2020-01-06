package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rensyuu {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();
	}

	private static void test(Scanner sc) {
		int [] intArray = new int[5];
		int [] myArray = intArray;
		
		int max = 0;
		System.out.print("숫자 5개를 입력하시오.");
		for(int i =0; i<5; i++) {
			intArray[i] = sc.nextInt() ;
			if(intArray[i]>max) {
				max =intArray[i];
			}
		}System.out.println("현재 가장 큰 수는" + max + "입니다");
	}
}

