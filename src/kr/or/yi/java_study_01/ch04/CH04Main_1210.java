package kr.or.yi.java_study_01.ch04;

import java.util.Arrays;

public class CH04Main_1210 {

	public static void main(String[] args) {
		Circle[] circleArr = {new Circle(1, "자바"), new Circle(2, "피자"), new Circle(3, "고르곤"), null, null};
		
//		System.out.print(Arrays.toString(circleArr)); // 전부 null 나옴
//		circleArr[0] = new Circle(1, "자바피자");
//		System.out.print(Arrays.toString(circleArr)); // toString로 호출됨

		prnArr(circleArr);
		// 추가
		System.out.println("=======추가=============");
		int idx = 2;
		circleArr[++idx] = new Circle(5, "빅 피자");
		prnArr(circleArr);	
		
		//삭제 
		System.out.println("=======삭제=============");
		int delNum = 1;
		circleArr[delNum] = null;
		for(int i = delNum; i<circleArr.length-1; i++) {
			circleArr[i] = circleArr[i+1];
		}
		prnArr(circleArr);
		
		//수정 
		System.out.println("=======수정=============");
		// radius = 4, name = "치즈 피자", index = 0
		circleArr[0].setRadius(4);
		circleArr[0].setName("치즈피자");
		prnArr(circleArr);
	}

	private static void prnArr(Circle[] circleArr) {
		for (Circle c : circleArr) {
			try {

				System.out.println(c); // 3.14뜨고 오류뜸
			} catch (NullPointerException e) {
				System.out.print("null ");
			}
		}
	}
}
