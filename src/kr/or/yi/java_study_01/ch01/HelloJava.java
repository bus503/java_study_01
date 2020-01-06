package kr.or.yi.java_study_01.ch01;

import java.util.Random;

public class HelloJava {/* 파일 이름과 동일한 클래스에만 퍼블릭을 붙일 수있다(그냥 한 파일안에는 하나의 클래스만 쓰도록하자) */

	public static void main(String[] args) { /* main이 메소드임 틀리면 오류남 */
		Random rnd = new Random();
		/* 함수내에서 선언된 변수는 지역변수 */
		String name = "이상원"; // 변수지정 (컨트롤+/)
		System.out.println("Hello Java"); /* ln이 줄바꿈 기능 함 \n도 같은 기능 */

		System.out.print("힘들지" + name);
//                                        문자열 + 변수 => 문자열 + 문자열 -> 하나의 문자열로 결합 (문자열 결함연산자(+)) 
		// 변수지정 (컨트롤+/) 해제도 똑같음

		/* 블럭주석 (컨트롤+쉬프트+/) 해제는 (컨트롤+쉬프트+\) 
		 */	
	}

}