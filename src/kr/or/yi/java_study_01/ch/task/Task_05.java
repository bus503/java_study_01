package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Task_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		test(sc);
		sc.close();

	}

	private static void test(Scanner sc) {
		System.out.print("정수 3개 입력 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && b > c && c < a) {
			System.out.println("중간 값은"+ b);}
		else if(a < b && a > c && c > b) {
			System.out.println("중간 값은" + c);}
		else if (a < b && b > c && c < a){
			System.out.println("중간 값은" + a);}
		else if (a>b && b<c && c>a) {
			System.out.println("중간 값은" + a);}
		else if (a<b && b>c && c>a) {
			System.out.println("중간 값은" + c);}
		else {
			System.out.println("중간 값은" + b);
		}
		}
	}


