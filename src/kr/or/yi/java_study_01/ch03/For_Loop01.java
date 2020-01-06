package kr.or.yi.java_study_01.ch03;

public class For_Loop01 {

	public static void main(String[] args) {
//		hardcoding();
//		for_loop01();
		/*
		 * 2*1=2 
		 * 2*2=2 
		 * ... 
		 * 2*9=9
		 */
		
		gugudan_lang();
//		int dan = 2; // 이중루프
//		1부터 10까지 짝수만 출력하시오.
//		1부터 10까지 홀수만 출력하시오.
//		
		for(int i=1; i<11; i++) {
			if(i % 2 == 1) {
				System.out.printf("%d ", i);
			}
		
		}
		System.out.println();
		
		for(int i=1; i<11; i=i+2) {
			System.out.printf
			("%d" , i);
		}			
		
		int i = 2;
		if(i == 2) System.out.println("짝수");
		
}
	
	

	private static void gugudan_lang() {
		for(int i=1; i<10; i++) {
		for (int dan=2; dan<10; dan++) {
			System.out.printf("%d * %d = %2d ", dan, i , dan*i);
		}
		System.out.println();
	}
	}

	private static void gugudan(int dan){
		gugu(dan);
	}



	private static void gugu(int dan) {
		for(int i=1; i<10; i++) {
			
			
			
			
			
			
			
			
			
			
			System.out.printf(" %d * %d = %d %n", dan, i, dan*i);
		}
	}

	private static void for_loop01() {
		for(int i=0; i<10; i++) {
			System.out.println("Hello Java" + i);
		}
		System.out.println("done");
	}

	private static void hardcoding() {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
	}
	
}
