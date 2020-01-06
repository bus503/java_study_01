package kr.or.yi.java_study_01.ch03.array;

public class Task01_1203 {

	public static void main(String[] args) {
//		whileTest();
//		ForTest();
		DowhileTest();
	}

	private static void DowhileTest() {
		int sum = 0, i = 0;
		do {
			sum = sum +i;
			i = i + 2;

		} while (i < 100);
		System.out.print("0에서 99까지의 짝수합은");
		System.out.print(sum);
	}
	

	private static void ForTest() {
		int sum = 0;
		for (int i = 0; i < 100; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void whileTest() {
		int sum = 0, i = 0;
		while (i < 100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println(sum);
	}

}
