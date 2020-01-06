package kr.or.yi.java_study_01.ch03;

public class For_Loop_Star_Task {

	public static void main(String[] args) {
		
		별찍기_01();
		별찍기_02();
		}

	private static void 별찍기_01() {
		for(int a=0; a<5; a++) {
			for(int b=1; b<5-a; b++) {
				System.out.print("공 ");
			}for(int c=0; c<a+1; c++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println();
	}


	private static void 별찍기_02() {
		for(int a=0; a<5; a++) {
			for(int b=1; b<a+1; b++) {
				System.out.print("공 ");
			}for(int c=0; c<5-a; c++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println();
	}
}
