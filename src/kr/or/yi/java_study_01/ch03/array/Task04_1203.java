package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task04_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
//		System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
//		char s = sc.nextLine().charAt(0);
			
//		for (int i=96; i<s; i++) {
//			for(int j=97; j<(s-i)+97; j++) {
//				System.out.print((char)j);
//			}
//			System.out.println();
//		}
		
		
		System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
		String s = sc.next();
		if(s.length() !=1) {
			System.out.println("알파벳하나만 입력하세요.");
			return;
		}
		char ch = s.charAt(0);
		if(ch < 'a' || ch >'z') {
			System.out.println("알파벳 소문자만 입력하세요");                    // 선생님코드
			return;
		}
		for(char i = ch; i>'a'; i--) {
			for(char j ='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
