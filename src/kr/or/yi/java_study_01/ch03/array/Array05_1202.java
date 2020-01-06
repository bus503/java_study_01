package kr.or.yi.java_study_01.ch03.array;

public class Array05_1202 {

	public static void main(String[] args) {
		
//		Negahanger();
		semihanger();
	}

	private static void semihanger() {
		double score[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } }; // 4행 2열짜리 2차원배열이 나옴
		double sum = 0;
		double yearSum = 0;
		for (int year = 0; year < score.length; year++) { // 학년별로 반복
			System.out.print(year+1 + "학년  ");
			yearSum = 0;
			for (int term = 0; term < score[year].length; term++) { // 학년의 학기별로 반복
				System.out.print(score[year][term] + " ");
				sum = sum + score[year][term]; // 전체평점 합
				yearSum = yearSum+ score[year][term];
			}
			System.out.printf("%.2f %n", yearSum/2.0);
		}
		int n = score.length;
		int m = score[0].length;
		System.out.println("4학년 전체 평점 평균은 " + sum / (n * m));

	}

	private static void Negahanger() {
		double score[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } }; // 4행 2열짜리 2차원배열이 나옴
		double sum = 0;
		double a = (score[0][0] + score[0][1]) / 2;
		System.out.printf("1학년 %.1f %.1f %.2f %n", score[0][0], score[0][1], a);

		double b = (score[1][0] + score[1][1]) / 2;
		System.out.printf("2학년 %.1f %.1f %.2f %n", score[1][0], score[1][1], b);

		double c = (score[2][0] + score[2][1]) / 2;
		System.out.printf("3학년 %.1f %.1f %.2f %n", score[2][0], score[2][1], c);

		double d = (score[3][0] + score[3][1]) / 2;
		System.out.printf("4학년 %.1f %.1f %.2f %n", score[3][0], score[3][1], d);

		for (int year = 0; year < score.length; year++) {
			for (int term = 0; term < score[year].length; term++) {
				sum = sum + score[year][term];

			}

		}
		int n = score.length;
		int m = score[0].length;
		System.out.println("4학년 전체 평점 평균은 " + sum / (n * m));
	}
}

