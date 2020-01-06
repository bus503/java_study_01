package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task08_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		test(sc);
		sensecode(sc);
		sc.close();

	}

	private static void sensecode(Scanner sc) {
		System.out.print("정수 몇개? >> ");
		int n = sc.nextInt();
		if (n <=0 || n >100) {
			System.out.println("1~100사이로 입력");
			return;  // 여기 종료
		}
		int [] intArray = new int[n];
		int r;
		for(int i = 0; i<intArray.length; i++) {
			r=(int)((Math.random()*100)+1);
			
				if(isDuplicate(r, intArray, i)) {
					i--;
					continue;
				
			}
			intArray[i] =r ;
		}
		Arrays.sort(intArray);
		for(int e : intArray) {
			System.out.print(e + " ");
		}
	}
	
	private static boolean isDuplicate(int key, int[] intArray, int i) {
		if (i<0) return false;
		for(int start = i; start > -1; start-- ) {
			if(intArray[start]==key) {
				return true;
			}
		}
		return false;
	}

	

	private static void test(Scanner sc) {
		Random rd = new Random();
		System.out.print("정수 몇개? >> ");
		int a = sc.nextInt();
		int[] Array = new int[a];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = rd.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (Array[i] == Array[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
