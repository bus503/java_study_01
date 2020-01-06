package kr.or.yi.java_study_01.ch04;

public class Circle extends Object{ //extends Object도 생략가능 
	//멤버변수가 2개
	
	public int radius;    //0으로 초기화되어있다
	public String name;		// string값은 null로 초기화 
	
	public Circle() {
		super();   // super는 생략가능 부모 생성자 호출(오브젝트)
	} 
	
	public Circle(String name) {
		this.name = name;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int radius, String name) {
		super();
		this.radius = radius;     //this는 나 자신을 의미. 매개변수에서 넘어온걸 제일 위에 필드로 보내줌
		this.name = name;		//super 는 부모를 의미
	}
	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 3.14 * radius * radius ;
	}

	@Override
	public String toString() {
		return String.format("Circle [%s, %s, %.2f]", radius, name, getArea());
	}//부모에 있는걸 재정의하겠다. 라는 의미 메소드와 매게변수가 동일해야한다
	// 알트시프트s로 이거 출력함

	
}
