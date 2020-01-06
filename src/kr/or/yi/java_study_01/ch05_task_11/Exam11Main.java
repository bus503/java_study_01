package kr.or.yi.java_study_01.ch05_task_11;

import java.util.Arrays;
import java.util.Scanner;

public class Exam11Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오  >> "); // 9 8 *
		int a = sc.nextInt();
		int b = sc.nextInt();
		String oper = sc.next();
		
		
		Calc[] calc = { new Mul(), new Add(), new Sub(), new Div()};
		String[] operArr = { "*", "+", "-", "/" };
//		Arrays.sort(operArr);
//		System.out.println(Arrays.toString(operArr));
		
		
		
//		System.out.println(Arrays.binarySearch(operArr, oper));
		int findOper = Arrays.binarySearch(operArr, oper);
//		System.out.println(a + " " + b + ":" + oper + ":" + findOper);
		calc[findOper].setValue(a, b);
		
		try {
			System.out.println(calc[findOper].calculate());
		}catch(ArithmeticException e) {
			System.out.println("계산 할 수 없음.");
		}

		sc.close();

	}
}
