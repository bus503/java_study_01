package kr.or.yi.java_study_01.ch02;



/**
 * 소스파일 : Hello.java
 * 작성일: 2019.11.20    (알트+쉬프트+j가 이런 큰 주석 만들어주는 단축키(문서화주석))          
 * 아래 클래스에 대한 설명을 적음.
 */
public class Hello {
	public static void main(String[] args) {
		double PI = 3.141592;
		// 지역변수(함수 내 선언된 변수) 선언 args도 지역변수임 지역변수는 중괄호 안 영역안에서만 유효함
//= 이라는 기호는 할당연산자 또는 배정연산자라고 함   left = right  왼쪽은 무조건 저장소. 오른쪽은 값 순서가 오른쪽이 먼저
		int i = 20; // 선언과 초기화   
		int s;		// 정수형 변수 선언
		char a;	    // 문자형 변수 선언
		
		s = sum(i,10);
		a = '?';
				
		System.out.println(a + "Hello" + s); 
		System.out.printf("%c%-10s %d %5.2f %n" , a, "Hello", s, 5/3.0);  
		// %c는문자()  %s는문자열(스트링)  %d는10진수중 정수  %f는 실수 %n은 줄바꿈
		// %5.2는 점을 포함한 전체자리수(띄어쓰기도 포함)에서 점 다음에 2자리까지 나오는거 
		// 'a' + "Hello" + 30
		// "a" + "Hello" + 30
		// "aHello" + 30
		// "aHello" + "30"  
		System.out.println(a + "hello" + (s + 10));
		System.out.println("\"java's 어렵다\"");
		/* System.out.printf("i = %d, j = %d%n", n, m); */
		// 숫자는 괄호를 붙여줘 먼저 계산을 시켜줘야 한다 "단어"가 있으면 전부 문자열로 바꿔주기때문에 괄호없으면 3010이 되버림
		
		PI = 3.14;
	}

	private static int sum(int n, int m) {
		// i = 10 이라고 적어줘도 이 중괄호안에선 못찾음 그래서 오류뜸
		return n + m;
		
		// 바꾸고 싶은 글자 알트+쉬프트+r 전체 바꾸기 단축키
	}
}
