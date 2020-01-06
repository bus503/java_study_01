package kr.or.yi.java_study_01.ch05_task;

import java.util.Scanner;

abstract class Converter {
	protected double ratio; // 비율

	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDesString();

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDesString() + "로 바꿉니다");
		System.out.println(getSrcString() + "을 입력하세요>>");
		double val = sc.nextDouble();
		double res = convert(val);

		System.out.println("변환결과: " + res + getDesString() + "입니다");
		sc.close();
	}
}
