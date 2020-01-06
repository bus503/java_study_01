package CH04Main_Q;

import java.util.Scanner;

public class MonthSchedule {
	private int nDays; // 해당 월의 총일수
	private Day[] days; // Day 객체 배열
	private Scanner sc;

	public MonthSchedule(int nDays, Day[] days, Scanner sc) {
		this.nDays = nDays;
		this.days = days;
		this.sc = sc;
	}

	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays]; // 일수만큼의 Day객체를 가지는 배열 생성
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in); //
	}

	private void input() { //
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();

		if (day < 0 || day > nDays) { // 0~29 만 유효
			System.out.println("날짜 잘못 입력하였습니다! 다시 입력해 주세요.");
			System.out.printf("1 ~ %d사이의 값을 입력하세요.", nDays);
			return;
		}
//		Day d = new Day();
//		d.setWork(work);
//		days[day] = d;
		days[day].set(work); //
	}

	private void view() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		
		if (day < 0 || day > nDays) { // 0~29 만 유효
			System.out.println("날짜 잘못 입력하였습니다.!");
			return;
		}
		System.out.print((day) + "일의 할 일은 ");

		days[day].show();
	}

	private void finish() {
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램."); // 메뉴 출력 처리.

		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			default:
				System.out.println("잘못입력하였습니다.");
			}
			System.out.println();
		}
	}
}
