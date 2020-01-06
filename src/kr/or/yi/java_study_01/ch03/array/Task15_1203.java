package kr.or.yi.java_study_01.ch03.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task15_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		do {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			}catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
			}
		}while(true);
	}
}
