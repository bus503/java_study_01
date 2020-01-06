package kr.or.yi.java_study_01.ch.task;

import java.util.Scanner;

public class Print_Task_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		task(sc);
		sc.close();

	}

	private static void task(Scanner sc) {
		System.out.print("신장을 입력해주세요(숫자만) >>");
		double a = sc.nextDouble();
		System.out.print("체중을 입력해주세요(숫자만) >>");
		double b = sc.nextDouble();
		System.out.print("나이를 입력해주세요(숫자만) >>");
		int c = sc.nextInt();
		
		double kkk = b/(a/100*a/100);
		
		if(c>=20 && 29>=c) {
			if(kkk<=17.9){
				System.out.printf("측정치는 %.1f입니다 20대의 측정치 중 저체중입니다", kkk);
			}
			else if(kkk>=18 && 23>=kkk) {
				System.out.printf("측정치는 %.1f입니다 20대의 측정치 중 표준체중입니다", kkk);
			}
			else if(kkk>=24 && 30>=kkk){
				System.out.printf("측정치는 %.1f입니다 20대의 측정치 중 과체중입니다", kkk);
			}
			else {
				System.out.printf("측정치는 %.1f입니다 20대의 측정치 중 비만입니다", kkk);
			}
		}
		else if (c>=30 && 39>=c) {
			if(kkk<=18.4){
				 System.out.printf("측정치는 %.1f입니다 30대의 측정치 중 저체중입니다", kkk);
			}
			else if(kkk>=18.5 && 24>=kkk) {
					System.out.printf("측정치는 %.1f입니다 30대의 측정치 중 표준체중입니다", kkk);
			}
			else if(kkk>=25 && 30>=kkk){
					System.out.printf("측정치는 %.1f입니다 30대의 측정치 중 과체중입니다", kkk);
			}
			else {
					System.out.printf("측정치는 %.1f입니다 30대의 측정치 중 비만입니다", kkk);
			}
		}
		else {
			System.out.println("20대와 30대만 판별할 수 있습니다");
		}
	}

}
