package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task09_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		int[][] intArray = new int[4][4];//16개
		for(int row = 0; row<intArray.length; row++) {
			for(int col = 0; col<intArray[row].length; col++) {
				intArray[row][col] = (int)(Math.random()*10)+1;
			}
		}
		
		for(int[] rows : intArray) {
			for(int e : rows) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
}
