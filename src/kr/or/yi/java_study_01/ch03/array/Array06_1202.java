package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class Array06_1202 {

	public static void main(String[] args) {

/*
 * 1.12명의 국어 , 영어, 수학 점수를 담는 2차원 배열선언 
 * 2.12명의 이름을 담은 배열 선언 
 * 3.60~ 100 사이의 랜덤한 값을 국어 , 영어, 수학 점수로 입력 
 * 4.이름 국어 영어 수학 총점 평균을 각각 출력 
 * 5.과목별 평균을 출력하시오
 * 이름    국어  영어  수학  총점  평균 
 * ========================== 
 * 이상원 90 90 90 270 90.00 
 * ...
 * ========================== 
 * 전체 (실수로)
 */
		int jumsu[][] = new int[12][3];
		double sum = 0;
		double avg = 0;
		double alla = 0;
		double allaavg = 0;
		double allbavg = 0;
		double allcavg = 0;
		double allb = 0;
		double allc = 0;
		double allall = 0;
		double allallavg= 0 ;
		double result = 0;
		double resultavg = 0;
		
		System.out.println("이름      국어  영어  수학   총점   평균");

		String[] strArr = {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주" };
		Random rnd = new Random();
		rnd.setSeed(1);
		for (int j = 0; j < jumsu.length; j++) {
			System.out.printf("%s   ", strArr[j]);

			for (int i = 0; i < jumsu[j].length; i++) {

				jumsu[j][i] = rnd.nextInt(40) + 60;

				System.out.printf(" %d ", jumsu[j][i]);

				sum = sum + jumsu[j][i];

			}
			avg = sum / 3;
			alla= alla + jumsu[j][0];
			allb = allb +jumsu[j][1];
			allc = allc +jumsu[j][2];
			allall= allall +sum;
			result = result +avg;
			
			System.out.printf("%.0f %.2f", sum, avg);
			sum = 0;
		
			System.out.println();
		
		}
		allaavg = alla / 12;
		allbavg = allb / 12;
		allcavg = allc / 12;
		allallavg = allall/12;
		resultavg = result / 12; 
		
		System.out.printf("전체평균 %.1f  %.1f  %.1f  %.1f  %.1f", allaavg, allbavg, allcavg, allallavg, resultavg);

	}
}
