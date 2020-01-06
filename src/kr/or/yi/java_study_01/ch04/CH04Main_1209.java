package kr.or.yi.java_study_01.ch04;

public class CH04Main_1209 {

	public static void main(String[] args) {
 //		ch04_01();		
//		ch04_02();		
//		ch04_03();
//		ch04_04();		
		ch04_05();
		
}


	private static void ch04_05() {
		Book book1 = new Book();
		System.out.println(book1);
	}


	private static void ch04_04() {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle ob3 = new Circle(3);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		ob1.setRadius(4);
		ob2.setRadius(5);
		ob3.setRadius(6);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}


	private static void ch04_03() {
		Book loveStory = new Book("춘향전");
		
		
		Book littlePrince = new Book("어린왕자", "생택쥐베리");
		
	
		Book book2 =new Book();
		
//		System.out.printf("%s : %s%n", littlePrince.title, littlePrince.author);
//		System.out.printf("%s : %s%n", loveStory.title, loveStory.author);
		
		System.out.println(littlePrince);
		System.out.println(loveStory);
	}


	private static void ch04_02() {
		Rectancle rect =new Rectancle(); //객체생성
		rect.width =4;
		rect.height =5;
		
		System.out.printf("사각형의 면적은 %d%n", rect.getArea());
		
		Rectancle rect2 = new Rectancle(5,5);
		System.out.printf("사각형의 면적은 %d%n", rect2.getArea());
	}	
	

	private static void ch04_01() {
		
		Circle c1 = new Circle(); // 생성자인 오른쪽 의미
		
		c1.name = "고르곤졸라";
		c1.radius = 100;
	//	System.out.printf("이름 %s 반지름 %d 면적 %.2f %n", c1.name, c1.radius, c1.getArea()); 
		System.out.println(c1); // 오른쪽에서 오버라이딩 해주면 이렇게 간단하게 적었을때 결과가 출력된다
		
		
		Object c2 = new Circle();  // 이것도 가능 오브젝트의 입장에서 보겠다
		((Circle)c2).name = "페퍼로니";   // 타입캐스트보다 .이 우선순위가 높다
		((Circle)c2).radius =50;
		//괄호로 싸주는 이유는 오브젝트의 입장에서만 봐서 circle가 안보이니까 저렇게 타입변형시켜준거임
	//	System.out.printf("이름 %s 반지름 %d 면적 %.2f %n", ((Circle)c2).name, ((Circle)c2).radius, ((Circle)c2).getArea());
		System.out.println(c2);
		
		
		Circle c3 = new Circle(30, "시카고피자");
		System.out.println(c3);   // 얘는 오른쪽에서 매개변수가있는걸로 감 이게 오버로딩;
		
	}//c1 이 참조하는곳에 circle 타입이 있다
		
}

