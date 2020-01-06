package kr.or.yi.java_study_01.ch03.array;

public class Array03 {

	public static void main(String[] args) {
		int[] intArr = {5,4,3,2,1};
		prnArray(intArr); //5,4,3,2,1 이 출력됨
		sort(intArr); //정렬수행
		prnArray(intArr); // 1,2,3,4,5   // 중첩loop를 사용해야함(for안에 for)
	}

	private static void prnArray(int[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("%d ", intArr[i]);
		}
		System.out.println();
	}

	private static void sort(int[] intArr) {
		int temp;
		for (int j = 1; j < intArr.length; j++) {
			for (int i = 0; i < intArr.length - j; i++) {
				if (intArr[i] > intArr[i + 1]) {
					temp = intArr[i + 1];
					intArr[i + 1] = intArr[i];
					intArr[i] = temp;
				}
			}
		}
	}
}
