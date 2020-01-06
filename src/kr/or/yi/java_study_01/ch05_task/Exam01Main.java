package kr.or.yi.java_study_01.ch05_task;

import java.util.Arrays;

import java.util.Scanner;


public class Exam01Main {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         
//	    Q1();
//      Q2();		
//		Q3();	
//		Q4();
//		q5();		
//      q6();
//		q7();	
//		q8();
//      q9(sc);
//      q10();
//      q11(sc);
		
		
//       System.out.println("그래픽 에디터 beauty를 실행합니다.");
//       int res;
//       Shape start =null;
//       Shape end =null;
//       do {
//    	   System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)");
//    	   res = sc.nextInt();   
//    	   
//    	   switch(res) {
//    	   case 1 :
//    		   System.out.println("삽입");
//    		   doInsert(sc,start,end);
//    		   break;
//    	   case 2 :
//    		   break;
//    	   case 3 :
//    		   break;
//    	   }
//    	   
//       }while(res <4);
//       System.out.println(" beauty를 종료합니다.");
       
      
       
		sc.close();
//		
//		switch(oper) {
//		case "+":
//			calc[0].setValue(a, b);
//			calc[0].calculate();
//			break;
//		case "/":
//			calc[1].setValue(a, b);
//			calc[1].calculate();
//			break;
//		case "*":
//			calc[2].setValue(a, b);
//			calc[2].calculate();
//			break;
//		case "-":
//			calc[3].setValue(a, b);
//			calc[3].calculate();
//			break;
		
		
	}



//	private static void doInsert(Scanner sc , Shape start, Shape end) {
//		System.out.println("Line(1), Rect(2), Circle(3)");
//		int res= sc.nextInt();
////		Shape temp = createShape(res);
//		temp.draw();
//		
//		 if (start ==null) { //리스트가 비었을 경우
//	    	   start = end = temp; //오른쪽부터 연산한다.
//	    	   //start = temp; end = temp;
//	       }else {//마지막 리스트노드에 추가
//	           end.setNext(temp);
//	           end = temp;
//	       
//	       }
//	}



//	private static Shape createShape(int res) {
//		if(res == 1) return new Line();
//		if(res == 2) return new Rect();
//		if(res ==3)  return new Circle();
//	
//		return null;
//	}



	private static void q11(Scanner sc) {
		System.out.println("두 정수와 연산자를 입력하시오  >> "); // 9 8 *
			int a = sc.nextInt();
			int b = sc.nextInt();
			String oper = sc.next();
			Calc[] calc = {new Mul(), new Add(), new Sub(), new Div()};
			String[] operArr = {"*", "+", "-", "/"};
			
			int findOper = Arrays.binarySearch(operArr, oper);
//		System.out.println(Arrays.binarySearch(operArr, oper));
//		System.out.println(a+" "+ b+":" + oper+ " :" + findOper);
			calc[findOper].setValue(a, b);
			
			try {
			System.out.println(calc[findOper].calculate());
			} catch(ArithmeticException e) {
				System.out.println("계산 할 수 없음");
			}
	}



	private static void q10() {
		Dictionary dic= new Dictionary(10);
        dic.put("황기태","자바" );
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은"+dic.get("황기태"));
	}



	private static void q9(Scanner sc) {
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
        int capacity = sc.nextInt();
        Stack ss = new StringStack(capacity); //만들고 set메소드 호출해도됨
        String res;
        for(int i =0; i<capacity+1; i++) {
        	System.out.print("문자열입력 >>");
        	res = sc.next();
        	if(res.equals("그만")) {
        		break;
        	}
        	ss.push(res);
        }
        System.out.println("모든 문자열 팝");
        
        for(int i=ss.length()-1 ;i> -1 ; i--) {
        	res = ss.pop();
        	System.out.println(res ==null?"":res +" ");
        }
        int length = sc.nextInt();
	}

	

	private static void q8() {
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p+"입니다");
		
		p.move(-5,5);
		System.out.println(p.toString()+"입니다");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다");
	}

	private static void q7() {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다");

		p.moveUp();
		System.out.println(p.toString()+"입니다");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다");
		
	    p.move(100,200,300);
		System.out.println(p.toString()+"입니다");
	}

	private static void q6() {
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint.toString() + "입니다");

		ColorPoint1 cp = new ColorPoint1(10, 10);

		cp.setXY(5, 5);
		cp.setColor("Red");
		System.out.println(cp.toString() + "입니다");
	}

	private static void q5() {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다");
	}

	private static void Q4() {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

	private static void Q3() {
		Converter toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

	private static void Q2() {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

	private static void Q1() {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
