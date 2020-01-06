package kr.or.yi.java_study_01.ch04_exam;

import java.util.Arrays;
import java.util.Scanner;

import kr.or.yi.java_study_01.ch04.Circle;

public class ExamMain {

	private static int kor;

	public static void main(String[] args) {
		// 1.학생정보를 관리하는 프로그램을 작성하세요. - ok
		// 2.학생클래스를 정의(번호,성명,국어,영어,수학)
		// 3.10개의 학생정보를 담을 수 있는 배열 -ok
		// 4.메뉴작성(1.학생목록, 2.학생추가, 3.학생수정 , 4.학생삭제 , 5.종료)

//		test();
		Student std01 = new Student(1, "배진우", 80, 90, 80);
		Student std02 = new Student(2, "현재승", 80, 90, 80);
		Student std03 = new Student(3, "장현서", 80, 90, 80);
		Student std04 = new Student(4, "황태원", 48, 48, 85);
		Student std05 = new Student(5, "정아름", 8, 94, 16);
		Student std06 = new Student(6, "권수진", 80, 90, 80);
		Student std07 = new Student(7, "이동주", 80, 90, 80);
		Student std08 = new Student(8, "황하나", 80, 90, 80);
		Student std09 = new Student(9, "박경진", 80, 90, 80);
		Student std10 = new Student(10, "권태헌", 80, 90, 80);
		Student std11 = new Student(11, "박인선", 80, 90, 80);
		Student std12 = new Student(12, "이상원", 80, 90, 80);

		Student[] stdArr = { std01, std02, std03, std04, std05, std06, std07, std08, std09, std10, std11, std12, null,
				null, null };
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1.학생목록, 2.학생추가, 3.학생수정 , 4.학생삭제 , 5.학생검색 , 6.종료");
			res = sc.nextInt();
			switch (res) {
			case 1:
				prnStudentInfo(stdArr);
				break;
			case 2:
				addStudent(stdArr, sc);
				break;
			case 3:
				updateStudent(stdArr, sc);
				break;
			case 4:
				delStudent(stdArr, sc);
				break;
			case 5:
				searchStudent(stdArr, sc);
				break;
			default:
			}
		} while (res < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
	}

	private static void searchStudent(Student[] stdArr, Scanner sc) {
		System.out.println("찾고싶은 학생의 번호를 입력하세요.");
		int stdNo = sc.nextInt();

		int findStdIdx = indexOfstudent(stdArr, stdNo);
		if (findStdIdx == -1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.println("해당 학생의 정보는 " + stdArr[findStdIdx]);
	}

	private static int indexOfstudent(Student[] stdArr, int stdNo) {
		for (int i = 0; i < stdArr.length && stdArr[i] != null; i++) {
			if (stdArr[i].getStdNo() == stdNo) {
				return i;
			}
		}
		return -1;
	}

	private static void delStudent(Student[] stdArr, Scanner sc) {
		System.out.println("삭제하고 싶은 학생의 번호를 입력해주세요.");
		int delStdNo = sc.nextInt();
		int findDelStdIdx = indexOfstudent(stdArr, delStdNo);
		System.out.println("삭제하고 싶은 학생의 번호");
		int i;
		for (i = findDelStdIdx; i < stdArr.length && stdArr[i] != null; i++) {
			stdArr[i] = stdArr[i + 1];
		}
		stdArr[i - 1] = null;

		for (int j = 0; j < stdArr.length && stdArr[j] != null; j++) {
			stdArr[j].setStdNo(j + 1);
		}
	}

	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("수정하고 싶은 학생의 번호를 입력해주세요.");
		int StdNo = sc.nextInt();
		int findIdx = indexOfstudent(stdArr, StdNo);

		if (findIdx == -1) {
			System.out.println(" 해당학생이 없음");
			return;
		}
		System.out.print("학생 수정 정보 입력 >> 국어, 영어, 수학");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		stdArr[findIdx].setKor(kor);
		stdArr[findIdx].setMath(math);
		stdArr[findIdx].setEng(eng);

//		for (int i = 0; i < stdArr.length; i++) {
//			if (stdArr[i].stdNo == StdNo) {
//				stdArr[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//				break;
//			}
//		}
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("순서대로 입력하세요 >> 성명, 국어, 영어, 수학 ");
		String stdName = sc.next();
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

	
		for (int i = 0; i < stdArr.length; i++) {
			if (stdArr[i] == null) {
				stdArr[i] = new Student(i+1, stdName, kor, math, eng);	
				break;
			}
		}
	}
	private static void prnStudentInfo(Student[] stdArr) {
		System.out.println("===========학생 목록 구현===========");

		for (Student s : stdArr) {
			if (s != null) {
				System.out.println(s);
			}
		}
	}

	private static void test() {
		Student std01 = new Student(1, "배진우", 80, 90, 80);
		System.out.println(std01);
		Student std02 = new Student(2, "이동주", 60, 90, 90);
		System.out.println(std02);

		System.out.println();

		Student[] stdArr = { std01, std02, };
		for (Student std : stdArr) {
			System.out.println(std);
		}
	}
}
