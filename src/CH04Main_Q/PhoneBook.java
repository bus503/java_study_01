package CH04Main_Q;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
//			Q1();		
//			Q2();
//			Q3();
//			Q4();
//	 		Q5();
//			Q6();
		Q7();
//			Q8();
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();

		switch (c) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}

	private static void Q8() {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("인원수 >> ");
		n = sc.nextInt();

		Phone[] person = new Phone[n];

		for (int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			person[i] = new Phone(sc.next(), sc.next());
		}
		System.out.print("저장되었습니다.");

		while (true) {
			System.out.print("검색할 이름 >> ");
			String searchName = sc.next();

			for (int i = 0; i < person.length; i++) {

				if (searchName.equals("그만")) {
					System.out.println("시스템을 종료합니다. ");
					break;
				} else if (searchName.equals(person[i].name)) {
					System.out.println(person[i].getName() + " 의 번호는 " + person[i].getTel() + "입니다. ");
				} else if (!searchName.equals(person[i].name) && i == (n - 1)) {
					System.out.println(searchName + " 이 없습니다. ");
					break;
				}
			}
		}
	}

	private static void Q7() {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}

	private static void Q6() {
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}

		int[] getRadius = new int[3];
		int max = 0;
		for (int j = 0; j < c.length; j++) {
			getRadius[j] = c[j].getRadius();
			if (getRadius[j] > max) {
				max = getRadius[j];
			}

		}
		System.out.print("가장 큰 면적의 원은");
		for (int k = 0; k < c.length; k++) {
			if (max == c[k].getRadius()) {
				c[k].show();
			}
		}
		sc.close();
	}

	private static void Q5() {
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
//		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
			sc.close();
		}
	}

	private static void Q4() {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();

		System.out.println("s의 면적은 " + s.square());

		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s를 포함합니다.");
	}

	private static void Q3() {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴"); // song 객체 생성
		song.show(); // 노래정보를 출력하는 메소드

	}

	private static void Q2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은  " + me.average());

		sc.close();
	}

	private static void Q1() {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
