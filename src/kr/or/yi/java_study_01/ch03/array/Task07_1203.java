package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task07_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		test(sc);
		sensecode(sc);
		sc.close();
	}

	private static void sensecode(Scanner sc) {
		int [] Array = new int[10];
		System.out.println(Arrays.toString(Array));
		
		for(int i =0; i<Array.length; i++) {
			Array[i]= (int)(Math.random()*10+1);
		}
		System.out.println(Arrays.toString(Array));
		double sum = 0;
		for(int e : Array) {
			System.out.print(e + " ");
			sum= sum+ e;
		}
		System.out.println("합은" + sum);
		System.out.println("평균은" + sum/Array.length );
	}

	private static void test(Scanner sc) {
		int [] Array = new int[10];
		double sum = 0;
		double avg = 0;
		
		System.out.print("랜덤한 정수들  >>  ");
		for(int j =0; j<Array.length; j++) {
			int i = (int)(Math.random()*10+1);
			System.out.print(i + "  ");
			sum = sum+i;
		}
		
		System.out.println();
		System.out.printf("합계는 >> %.0f ", sum);
		
		
		System.out.println();
			avg = sum/10;
		System.out.println("평균은 >> " + avg);
	}
}







