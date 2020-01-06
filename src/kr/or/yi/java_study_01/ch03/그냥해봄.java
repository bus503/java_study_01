package kr.or.yi.java_study_01.ch03;

public class 그냥해봄 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for (int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %2d ", dan, i , dan*i);
			}
			
			System.out.println();
		}

}
}
