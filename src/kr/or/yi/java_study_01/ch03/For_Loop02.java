package kr.or.yi.java_study_01.ch03;

public class For_Loop02 {

	public static void main(String[] args) {
//		yo();
// 1부터 100까지의 짝수합과 홀수합, 전체합을 구하는 반복문을 작성하시오.	
//		exam()		
		별찍기01();
		별찍기02();
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<5-j; i++) {
				System.out.print("*");
			}
		System.out.println();
	}
}

	private static void 별찍기02() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<j+1; i++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

	private static void 별찍기01() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

	private static void exam() {
		int evensum = 0;
		int oddsum = 0;
		for(int i=1; i < 101 ; i++) {
			if(i %2 == 0) {
				evensum = evensum + i;
			}else {
				oddsum = oddsum +i;
			}
		}
		System.out.printf("홀수의 합 %d 짝수의 합 %d 전체의 합 %d%n", oddsum, evensum, oddsum+evensum);
	}

	private static void yo() {
		int sum = 0;
		for(int i = 0; i < 11; i++) {
			sum = sum +i;
		}
		System.out.println(sum);
	}
}

	