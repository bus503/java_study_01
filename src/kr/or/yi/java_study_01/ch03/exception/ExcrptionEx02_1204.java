package kr.or.yi.java_study_01.ch03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcrptionEx02_1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		array(sc);
		sc.close();

	}

	private static void array(Scanner sc) {
		
		try {
			
			int[] intArr = new int[5];
//			System.out.println(5/0);
//			int b = sc.nextInt();
			int c = Integer.parseInt("a");
//			intArr[5]=10;   //착각을해서 범위를 벗어나는 경우.
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생");
		}catch(ArithmeticException e) {
			System.out.println("예외발생2");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 가능");
		}catch(NumberFormatException err) {
			System.out.println("문자화된 숫자만 가능합니다.");
		}
			
//			catch(Exception e) {
//			System.out.println("위의 예외를 제외한 나머지 예외 발생");
//			e.printStackTrace();
//		}
		
		
	}
}
