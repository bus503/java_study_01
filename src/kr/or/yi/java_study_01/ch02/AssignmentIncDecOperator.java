package kr.or.yi.java_study_01.ch02;

public class AssignmentIncDecOperator{
	public static void main(String[] args) {
//		assignmentIncDec();
//		logicalOperator();
		ternaryOperator();
		System.out.printf("%x%n", 10);
		System.out.printf("%4x%n", 10);
		System.out.printf("%04x%n", 10);	
	}
//책 91페이지
	private static void ternaryOperator() {
		int a = 5;
		int b = 3;
		
		int res = a > b ? a-b : b-a;
		System.out.printf("두 수의 차는 %d%n", res);
		
		System.out.println("두수의 차는 "+ ((a>b) ? (a-b) : (b-a)));
	}

	private static void logicalOperator() {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 >0));
	}

private static void assignmentIncDec() {
		int a=3, b=3, c=3;
		a += 3;
		b *= 3;
		c %= 2;
		System.out.printf("a= %d b= %d c=%d%n",a ,b ,c);
		
		int d=3;
		a = d++;
		System.out.printf("a= %d b= %d%n", a, d);
		a = ++d; 
		System.out.printf("a= %d b= %d%n", a, d);
		a = d--;
		System.out.printf("a= %d b= %d%n", a, d);
		a = --d;
		System.out.printf("a= %d b= %d%n", a, d);
	}
}
